/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

/**
 *
 * @author Ivan
 */
public class LeerMatriculas2 {

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/matriculas.xml"); //fichero a leer

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

            DocumentBuilder parseador = dbf.newDocumentBuilder(); //objeto para parsear el XML

            Document doc = parseador.parse(f); //parsea (lee) el XML
            Node raiz = doc.getFirstChild();

            NodeList matriculas = raiz.getChildNodes();

            Element elRaiz = (Element) raiz;
            NodeList listaCursos = elRaiz.getElementsByTagName("Matricula");

            int contador = 0;
            for (int i = 0; i < matriculas.getLength(); i++) {
                Node matricula = matriculas.item(i);

                if (matricula.getNodeType() == Node.ELEMENT_NODE) {
                    contador++;//para sacar el orden de las distintas matrículas
                    System.out.println(contador + "-" + matricula.getNodeName());
                    NamedNodeMap atributos = matricula.getAttributes();

                    //sacamos los atributos de matricula
                    System.out.print("\t" + atributos.item(0).getNodeName() + ": ");
                    System.out.print(atributos.item(0).getNodeValue() + " ");

                    System.out.print(atributos.item(1).getNodeName() + ": ");
                    System.out.println(atributos.item(1).getNodeValue());

                    //sacamos los hijos de matricula
                    NodeList nombreCurso = matricula.getChildNodes();
                    NodeList codigoAlumno = matricula.getChildNodes();

                    //cogemos los que queremos
                    Node datosNombre = nombreCurso.item(1);
                    Node datosCodigo = codigoAlumno.item(3);

                    //obtengo los hijos de curso
                    NodeList valorNombre = datosNombre.getChildNodes();
                    Node nombre = valorNombre.item(1);

                    System.out.print("\t" + nombre.getNodeName() + " " + datosNombre.getNodeName() + ": ");
                    Node valor = nombre.getFirstChild();//es un text
                    //sacamos el valor
                    if (valor != null && valor.getNodeType() == Node.TEXT_NODE) {
                        System.out.println(valor.getNodeValue());
                    }
                    //obtengo los hijos de estudiante
                    NodeList valorCodigo = datosCodigo.getChildNodes();
                    Node codigo = valorCodigo.item(3);//con el 3 obtengo el nombre de los estudiantes

                    System.out.print("\t" + datosCodigo.getNodeName() + ": ");
                    Node valor1 = codigo.getFirstChild();//es un text
                    //sacamos el valor
                    if (valor1 != null && valor1.getNodeType() == Node.TEXT_NODE) {
                        System.out.print(valor1.getNodeValue());
                    }

                }
                System.out.println("");
            }
            System.out.println("-------------------");
            System.out.println("Total cursos: " + listaCursos.getLength());

        } catch (SAXException | IOException | ParserConfigurationException ex) {
            Logger.getLogger(LeerMatriculas2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
