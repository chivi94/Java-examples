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





//Recorremos el arbol DOM usando sólo nodos (Node)
//Con lo cual tendremos que comprobar el tipo de los nodos hijo, para ver si 
//son Elementos (ELEMENT_NODE) y diferenciarlos de los textos (TEXT_NODE), como los saltos de linea.
public class LeerCursos_2 {

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/cursos.xml"); //fichero a leer

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setIgnoringElementContentWhitespace(true);

            DocumentBuilder parseador = dbf.newDocumentBuilder(); //objeto para parsear el XML
            Document doc = parseador.parse(f); //parsea (lee) el XML y lo carga en un objeto Document

            //Tenemos en doc todo el XML (como un arbol DOM), ahora lo podemos procesar utilizando sus métodos
            //Un archivo XML siempre va de arriba hacia abajo, por lo tanto, el primer nodo 
            //que encontrará será <Cursos>
            
            //Nodo raiz
            Node raiz = doc.getFirstChild();
            System.out.println("Elemento raiz: " + raiz.getNodeName());

            //Obtenemos todos sus nodos hijos Curso
            NodeList cursos = raiz.getChildNodes(); //devuelve 7 porque cuenta los saltos de linea
            System.out.println("Total cursos: " + cursos.getLength());

            //Entonces para esto trabajamos con Element
            Element elRaiz= (Element) raiz;//transformamos el NODO a ELEMENTO
            NodeList listaCursos = elRaiz.getElementsByTagName("Curso"); //para usar este método y conseguir lo que queremos
            System.out.println("Total cursos: " + listaCursos.getLength());

            //Procesamos TODOS los nodos hijos
            for (int i = 0; i < cursos.getLength(); i++) {
                Node curso = cursos.item(i);

                if (curso.getNodeType() == Node.ELEMENT_NODE) { //es un CURSO
                    //obtengo los atritubos del Curso
                    NamedNodeMap atributos = curso.getAttributes();
                    //sólo hay uno
                    System.out.print(atributos.item(0).getNodeName() + ": ");
                    System.out.print(atributos.item(0).getNodeValue());

                    //ahora obtengo todos los hijos del Curso en cuestión
                    NodeList hijosCurso = curso.getChildNodes();
                    for (int j = 0; j < hijosCurso.getLength(); j++) {
                        //procesamos cada hijo
                        Node datoCurso = hijosCurso.item(j);
                        if (datoCurso.getNodeType() == Node.ELEMENT_NODE) { //es uno de los ELEMENTOS
                            //mostramos el nombre del elemento
                            System.out.print("\t" + datoCurso.getNodeName() + ": ");
                            //y el valor
                            Node valor = datoCurso.getFirstChild(); //es un TEXT
                            if (valor != null && valor.getNodeType() == Node.TEXT_NODE) { //compruebo por si 
                                System.out.print(valor.getNodeValue());
                            }
                        }
                    }
                    System.out.println();
                }
            }
        } catch (SAXException | ParserConfigurationException | IOException ex) {
            Logger.getLogger(LeerCursos_2.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

}
