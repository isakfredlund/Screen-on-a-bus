package xmlparser;
import model.Line;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;
import java.net.URL;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
 
public class Xmlparse {
	static Line linje;
	static String url; 
			// http://www.labs.skanetrafiken.se/v2.2/stationresults.asp?selPointFrKey=80003 - orkanen
	
	public Xmlparse(String url){
		this.url = url;
	}
	public void yolo(){
	    try {
	    	
	    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	    	Document doc = dBuilder.parse(new URL(url).openStream());

			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("Line");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					String name = eElement.getElementsByTagName("Name").item(0).getTextContent();
					String towards = eElement.getElementsByTagName("Towards").item(0).getTextContent();
					String typ = eElement.getElementsByTagName("LineTypeName").item(0).getTextContent();
					
					//System.out.println("Name: " + name); // Name
					//System.out.println("Towards: " + towards); // Towards
					System.out.println(typ+" "+name+" mot "+towards);
					linje = new Line(name, towards);
				}
			}
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
 
}