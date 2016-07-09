/*
 Programa que pida al usuario un nombre de estudiante
 y devuelve el nº de matriculas que tiene dicho estudiante 
 indicando la fecha de matriculación y curso en el que se ha matriculado 
 */
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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Ivan
 */
public class MatriculasXPath {
    

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/matriculas.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(f);

            XPath xp = XPathFactory.newInstance().newXPath();
            //Consultas Xpath
            String cantidad_matriculas = "count(//Matricula/Estudiante/Nombre[contains(.,'";//1-Contar las matrículas
            String fin_cantidad_matriculas = "')])";

            String fecha = "//Matricula[Estudiante[contains(Nombre,'";
            String fin_fecha = "')]]";//2-Fecha de matriculación

            String curso = "//Matricula/Estudiante[contains(Nombre,'";
            String fin_curso = "')]/../Curso/Nombre";//3-Nombre del curso
            //Petición al usuario por teclado
            System.out.print("Introduce el nombre del alumno a buscar:");
            String nombre = new BufferedReader(new InputStreamReader(System.in)).readLine();

            //Ejecutamos las consultas
            //1-Cantidad de matrículas del alumno introducido por el usuario       
            XPathExpression xpe;
            
            xpe = xp.compile(cantidad_matriculas + nombre + fin_cantidad_matriculas);
            Double matriculas = (Double) xpe.evaluate(doc, XPathConstants.NUMBER);

            //2-Fecha de matriculacion
            xpe = xp.compile(fecha + nombre + fin_fecha);
            NodeList fecha_matriculacion = (NodeList) xpe.evaluate(doc, XPathConstants.NODESET);

            //3-Datos del curso en el que el alumno se ha matriculado
            xpe = xp.compile(curso + nombre + fin_curso);
            NodeList los_cursos = (NodeList) xpe.evaluate(doc, XPathConstants.NODESET);
            
            //Mostramos los atributos
            if (los_cursos != null && fecha_matriculacion != null) {
                System.out.println("Número de matrículas del alumno/a:" + matriculas.intValue());
                for (int i = 0; i < matriculas.intValue(); i++) {
                    NamedNodeMap atributos = fecha_matriculacion.item(i).getAttributes();
                    
                    //System.out.println("Fecha:" + atributos.item(0).getNodeValue());
                    System.out.println("\t"+atributos.item(0).getNodeName()+":"+atributos.item(0).getNodeValue());
                    System.out.println("\t\t"+los_cursos.item(i).getNodeName()+":" + los_cursos.item(i).getTextContent());
                }
            } 

        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            Logger.getLogger(MatriculasXPath.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
