/*
3.	Write a webservice that accepts the following XML document as the payload:
<InputDocument>
	<DeclarationList>
		<Declaration Command="DEFAULT" Version="5.13">
			<DeclarationHeader>
				<Jurisdiction>IE</Jurisdiction>
				<CWProcedure>IMPORT</CWProcedure>
							<DeclarationDestination>CUSTOMSWAREIE</DeclarationDestination>
				<DocumentRef>71Q0019681</DocumentRef>
				<SiteID>DUB</SiteID>
				<AccountCode>G0779837</AccountCode>
			</DeclarationHeader>
		</Declaration>
	</DeclarationList>
</InputDocument>

The webservice should respond with a status code which is based on parsing the contents of the XML payload

a.	If the XML document is given here is passed then return a status of ‘0’ – which means the document was structured correctly.
b.	If the Declararation’s Command <> ‘DEFAULT’ then return ‘-1’ – which means invalid command specified.
c.	If the SiteID <> ‘DUB’ then return ‘-2’ – invalid Site specified
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class Q3 {
	public static void main(String[] args){
	/*
	 * 
	 * Code does not run fully just did my best to show how I would try to complete this question	
	 *
	 */
	
		System.out.print(webService());	
	
	}
	public static int webService(){
		
		
		if(eElement.getAttribute("Command").equals("DEFAULT")){ //Check if declaration command is equal to "Default"
        	return -1;
        	 
		}
		if(eElement.getElementsByTagName("SiteID").item(0).getTextContent().equals("DUB")){ //Check if the SiteID is equal to "DUB"
			return -2;
		}
		
	}
}

