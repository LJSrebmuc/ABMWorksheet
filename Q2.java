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
	    	  //Create a file (inputXML.txt) and link it to the program 
	         File inputFile = new File("inputXML.txt");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         NodeList nList = doc.getElementsByTagName("Reference");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) { //Loop through all nodes in XML tree
	             Node nNode = nList.item(temp);
	             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	                 Element eElement = (Element) nNode;
	                 
	                 if(eElement.getAttribute("RefCode").equals("CAR")){ //Check if Reference code is equal to "CAR"
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode")); //Print out Reference code
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent()); //Print out text in Reference Text
	                 }else if(eElement.getAttribute("RefCode").equals("TRV")){ //Check if Reference code is equal to "TRV"
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode")); //Print out Reference code
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent());//Print out text in Reference Text
	                 }else if(eElement.getAttribute("RefCode").equals("MWB")){ //Check if Reference code is equal to "WMB"
	                	 System.out.println("RefCode : " 
	     	                    + eElement.getAttribute("RefCode")); //Print out Reference code
	                	 System.out.println("RefText : " 
		                         + eElement
		                         .getElementsByTagName("RefText")
		                         .item(0)
		                         .getTextContent());//Print out text in Reference Text
	                 }	                 
	             }
	         }
	      }catch (Exception e) {
	    	  System.out.print(e);
	      }
	}
}
