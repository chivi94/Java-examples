/*Dado el fichero matriculas.xml, procésale adecuadamente para obtener la siguiente salida:

 1-Matricula
 Fecha:		Hora:
 Nombre curso:
 Estudiante:
 2-Matricula
 Fecha:		Hora:
 Nombre curso:
 Estudiante:
 -----------------------------------------------------------
 Total matrículas: 4
 */
package EjemploXML;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerMatriculas {

    public static void mostrarCurso(Node nodo) {
        Element e = (Element) nodo;
        NodeList cursos = e.getElementsByTagName("Curso");

        Node curso = cursos.item(0);
        String nombre = ((Element) curso).getElementsByTagName("Nombre").item(0).getFirstChild().getTextContent();
        System.out.println("\tNombre curso:" + nombre);
    }

    public static void mostrarEstudiante(Node nodo) {
        Element e = (Element) nodo;
        NodeList estudiantes = e.getElementsByTagName("Curso");

        Node estudiante = estudiantes.item(0);
        String codigo = ((Element) estudiante).getElementsByTagName("Código").item(0).getFirstChild().getTextContent();
        String nombre = ((Element) estudiante).getElementsByTagName("Nombre").item(0).getFirstChild().getTextContent();
        System.out.println("\tEstudiante:" + nombre + "," + codigo);
    }

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/matriculas.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder parseador = dbf.newDocumentBuilder();
            Document doc = parseador.parse(f);

            Node raiz = doc.getFirstChild();
            NodeList matriculas = raiz.getChildNodes();
            int cont = 0;

            //procesamos cada matrícula
            for (int i = 0; i < matriculas.getLength(); i++) {
                Node matricula = matriculas.item(i);
                if (matricula != null && matricula.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(++cont + "-" + matricula.getNodeName());

                    NamedNodeMap atributos = matricula.getAttributes();
                    for (int j = 0; j < atributos.getLength(); j++) {
                        System.out.println("\t" + atributos.item(j).getNodeName() + ":" + atributos.item(j).getTextContent());

                    }
                    System.out.println();

                    mostrarCurso(matricula);
                    mostrarEstudiante(matricula);
                    
                    System.out.println();
                }

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(LeerMatriculas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
