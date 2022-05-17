import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Ejer1 {
    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("restaurante.xml"));
            Node root =doc.getDocumentElement();
            NodeList n1= doc.getElementsByTagName("plato");





            for (int i = 0; i <n1.getLength() ; i++) {
                Element disponible= doc.createElement("disponible");
                disponible.setTextContent("Si");
                n1.item(i).appendChild(disponible);


            }

            Element plato=doc.createElement("plato");
            plato.setAttribute("calorias","300");

            Element nombre= doc.createElement("nombre");
            nombre.setTextContent("Lentejas");

            Element precio= doc.createElement("precio");
            precio.setTextContent("7,8");

            Element disponible= doc.createElement("disponible");
            disponible.setTextContent("si");

            plato.appendChild(nombre);
            plato.appendChild(precio);
            plato.appendChild(disponible);

            root.insertBefore(plato,doc.getElementsByTagName("plato").item(0));





            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");


            DOMSource origen = new DOMSource(root);
            File restauranteModificado = new File("ejercicio2.xml");
            StreamResult destino = new StreamResult(restauranteModificado);
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
