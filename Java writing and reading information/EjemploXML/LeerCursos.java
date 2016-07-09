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


/*Leer el fichero xml cursos.xml y mostrarlo por consola con el formato que vamos a mostrar a continuación:
 Elemento raíz:
 Total cursos:
 Curso:(código) Nombre:(nombre del curso) Créditos:(horas) Tarifa:(tarifa de alquiler del laboratorio)*/
public class LeerCursos {

    public static void main(String[] args) {
        try {
            File f = new File("src/EjemploXML/cursos.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();//no se puede crear con new porque DocumentBuilderFactory es una clase abstracta y para hacer referencia,se hace con newInstance()
            DocumentBuilder parseador = dbf.newDocumentBuilder();//con este objeto podemos parsear el fichero
            Document doc = parseador.parse(f);//con el metodo parse podemos parsear el archivo

            Element raiz = doc.getDocumentElement();
            System.out.println("Elemento raíz:" + raiz.getNodeName());

            //Obtenemos todos los nodos hijos del raíz que tienen la etiqueta curso
            NodeList cursos = raiz.getElementsByTagName("Curso");//devuelve una NodeList,por lo tanto,lo recogemos en una lista de nodos
            System.out.println("Total cursos:" + cursos.getLength());

            //Procesamos cada curso
            for (int i = 0; i < cursos.getLength(); i++) {
                Node curso = cursos.item(i);
                if (curso.getNodeType() == Node.ELEMENT_NODE) {
                    //Obtenemos sus atributos
                    NamedNodeMap atributos = curso.getAttributes();
                    System.out.println("Curso:" + atributos.item(0).getNodeValue());
                    //Obtenemos sus hijos
                    NodeList datos = curso.getChildNodes();
                    for (int j = 0; j < datos.getLength(); j++) {
                        Node datosChild = datos.item(j);
                        if (datosChild.getNodeType() == Node.ELEMENT_NODE) {
                            //System.out.println("\t" + datosChild.getNodeName() + ":" + datosChild.getTextContent());
                            System.out.print(" "+datosChild.getNodeName()+":");
                            Node valor=datosChild.getFirstChild();
                            if(valor!=null && valor.getNodeType()==Node.TEXT_NODE){
                                System.out.print(valor.getNodeValue()+"\n");
                            }
                        }

                    }

                }

            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(LeerCursos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
