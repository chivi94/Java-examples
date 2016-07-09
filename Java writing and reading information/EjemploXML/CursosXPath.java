package EjemploXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CursosXPath {

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/cursos.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(f);//también se puede parsear usando directamente la ruta del ficher(sin usar el objeto File)

            XPath xp = XPathFactory.newInstance().newXPath();

            //Consultas XPath  a realizar sobre el arbol DOM
            String n_cursos = "count(//Curso)";//-->cuenta el numero de cursos del xml
            String obtener_cursos = "//Cursos/Curso";
            String obtener_codigo_cursos = "//Cursos/Curso[@Codigo='";//-->Se deja abierto porque el código de curso lo va a introducir el usuario

            //Ejecutamos las consultas
            XPathExpression xpe = xp.compile(n_cursos);
            Double cursos = (Double) xpe.evaluate(doc, XPathConstants.NUMBER);
            System.out.println("Numero de cursos: " + cursos.intValue());

            xpe = xp.compile(obtener_cursos);
            NodeList los_cursos = (NodeList) xpe.evaluate(doc, XPathConstants.NODESET);
            //Procesar todos los cursos recuperados
            for (int i = 0; i < los_cursos.getLength(); i++) {
                Node cursito=los_cursos.item(i);
                if (cursito.getNodeType()==Node.ELEMENT_NODE) {
                    System.out.println(cursito.getNodeName()+":"+cursito.getTextContent());
                }
               
            }
          
            System.out.print("Introduce el codigo de curso a buscar:");
            String codigoCurso = new BufferedReader(new InputStreamReader(System.in)).readLine();
            xpe = xp.compile(obtener_codigo_cursos + codigoCurso + "']");

            Node curso = (Node) xpe.evaluate(doc, XPathConstants.NODE);
            if(curso!=null){
                System.out.println(curso.getTextContent());
            }else{
                System.out.println("No hay ningún curso con ese código");
            }
            //xp.compile(null)-->con este objeto compilamos las consultas realizadas en XPath,pasadas al metodo como un String.Comprobamos que no tenga ningún error
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            Logger.getLogger(CursosXPath.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
