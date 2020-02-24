import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Q2 {
	public static void main(String[] args) {

	      try {
	         File inputFile = new File("inputXML.txt");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         NodeList nList = doc.getElementsByTagName("Reference");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	             Node nNode = nList.item(temp);
	             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                 Element eElement = (Element) nNode;
	                 
	                 if(eElement.getAttribute("RefCode").equals("CAR")){
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode"));
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent());
	                 }if(eElement.getAttribute("RefCode").equals("TRV")){
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode"));
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent());
	                 }if(eElement.getAttribute("RefCode").equals("MWB")){
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode"));
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent());
	                 }
	                 
	             }
	         }
	      }catch (Exception e) {
	          e.printStackTrace();
	      }
	}
}
