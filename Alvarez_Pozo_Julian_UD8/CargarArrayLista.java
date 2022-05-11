import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CargarArrayLista {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder db=null;
        ArrayList<Alumnos> alumnos=new ArrayList<>();
        try {
            db=dbf.newDocumentBuilder();
            Document doc= db.parse(new File("alumnos.xml"));
            NodeList n1= doc.getElementsByTagName("alumno");
            for (int i = 0; i < n1.getLength() ; i++) {
                String dni="";
                String nombre="";
                String apellidos="";
                String direccion="";

                Element e= (Element) n1.item(i);
                if (e.hasAttributes()){
                   NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j <nodeMap.getLength() ; j++) {
                        Node node=nodeMap.item(j);
                        Attr atributo=e.getAttributeNode(node.getNodeName());
                        if (atributo.getNodeName().equals("dni")){
                            dni=(atributo.getValue());

                        }


                    }


                }
                NodeList n2= n1.item(i).getChildNodes();
                for (int j = 0; j <n2.getLength() ; j++) {
                    if (n2.item(j).getNodeType()==Node.ELEMENT_NODE){
                        Element etiqueta= (Element) n2.item(j);
                        switch (etiqueta.getTagName()){
                            case "nombre":
                                nombre=etiqueta.getTextContent();
                                break;
                            case "direccion":
                                direccion=etiqueta.getTextContent();
                                break;
                            case "apellidos":
                                apellidos=etiqueta.getTextContent();
                                break;


                        }


                    }

                }
                alumnos.add(new Alumnos(dni,nombre,apellidos,direccion));
                
            }
            ArrayList<String>dnis=new ArrayList<>();
            for (Alumnos a:alumnos) {

                dnis.add(a.getDni());

            }
            Collections.sort(dnis);
            System.out.println(alumnos);
            System.out.println(dnis);





        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
