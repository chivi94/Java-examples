package EjemploXML;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*Fecha: 24-03-2014 
 Localidad: PRADOLUENGO (BURGOS) 
 Descripción: MÉDICOS, MEDICINA GENERAL 
 Tipo de jornada: PARCIAL 
 Horario:(sin determinar) 
 Tipo de contrato: INDEFINIDO

 */
public class DatosAbiertos {

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setIgnoringElementContentWhitespace(true);

            DocumentBuilder parseador = dbf.newDocumentBuilder();
            Document doc = parseador.parse("http://empleocastillayleon.jcyl.es/oficinavirtual/ofertasxml");

            Node raiz = doc.getFirstChild();

            NodeList hijos = raiz.getChildNodes();

            Element laRaiz = (Element) raiz;
            NodeList ofertList = laRaiz.getElementsByTagName("oferta");

            for (int i = 0; i < hijos.getLength(); i++) {
                Node hijo = hijos.item(i);

                if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                    NodeList hijosOferta = hijo.getChildNodes();
                    for (int j = 0; j < hijosOferta.getLength(); j++) {

                        Node datoOferta = hijosOferta.item(j);
                        if (datoOferta.getNodeName().contains("Fecha")) {
                            System.out.println("Fecha:" + datoOferta.getTextContent().replaceAll("\n", " "));
                        } else if (datoOferta.getNodeName().contains("Localidad")) {
                            System.out.println("Localidad:" + datoOferta.getTextContent().replaceAll("\n", " ") + "(" + hijosOferta.item(j + 2).getTextContent().replaceAll("\n", " ") + ")");
                        } else if (datoOferta.getNodeName().contains("Ocupación_Principal")) {
                            System.out.println("Descripción:" + datoOferta.getTextContent().replaceAll("\n", " "));
                        } else if (datoOferta.getNodeName().contains("Jornada_de_Trabajo")) {
                            System.out.println("Tipo de jornada" + datoOferta.getTextContent().replaceAll("\n", " "));
                        } else if (datoOferta.getNodeName().startsWith("Horario")) {
                            System.out.println("Tipo de horario" + datoOferta.getTextContent().replaceAll("\n", " "));
                        } else if (datoOferta.getNodeName().startsWith("Relación")) {
                            System.out.println("Tipo de contrato:" + datoOferta.getTextContent().replaceAll("\n", " "));
                        }

                    }
                    System.out.println();
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(DatosAbiertos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
