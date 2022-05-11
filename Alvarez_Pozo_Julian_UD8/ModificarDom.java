import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDom {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf=DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db=dbf.newDocumentBuilder();
            Document doc= db.parse(new File("alumnos.xml"));
            Node root =doc.getDocumentElement();
            NodeList n1 =  doc.getElementsByTagName("alumno");
            for (int i = 0; i <n1.getLength(); i++) {
                Element instituto = doc.createElement("instituto");
                instituto.setTextContent("Ies Alixar");
                n1.item(i).appendChild(instituto);


            }
            Element alumno=doc.createElement("alumno");
            alumno.setAttribute("dni","8888888X");

            Element nombre=doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellido=doc.createElement("apellido");
            apellido.setTextContent("Ruiz");

            Element direccion =doc.createElement("direccon");
            direccion.setTextContent("Alli");

            Element instituto= doc.createElement("instituto");
            instituto.setTextContent("Ies alixar");

            alumno.appendChild(nombre);
            alumno.appendChild(apellido);
            alumno.appendChild(direccion);
            alumno.appendChild(instituto);


            root.insertBefore(alumno,doc.getElementsByTagName("alumno").item(0));




            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origen = new DOMSource(root);
            File alumnosModificados = new File("alumnos_modificado.xml");
            StreamResult destino = new StreamResult(alumnosModificados);
            transformer.transform(origen,destino);

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
