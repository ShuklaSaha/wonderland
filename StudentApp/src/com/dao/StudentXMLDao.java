package com.dao;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class StudentXMLDao {
	public static void createXML()
	{
	try
	{
		DocumentBuilderFactory documentbuilderfactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder documentbuilder=documentbuilderfactory.newDocumentBuilder();
		Document doc=documentbuilder.newDocument();
		Element rootelement=doc.createElement("Books");
		doc.appendChild(rootelement);
		Element book1=doc.createElement("Book");
		rootelement.appendChild(book1);
		Attr attrtype1=doc.createAttribute("Category");
		attrtype1.setValue("Children");
		book1.setAttributeNode(attrtype1);
		Element name1=doc.createElement("name");
		name1.appendChild(doc.createTextNode("Harry Potter"));
		book1.appendChild(name1);
		Element price1=doc.createElement("price");
		price1.appendChild(doc.createTextNode("$16.89"));
		book1.appendChild(price1);
		//write the content in xml file
		TransformerFactory transformerfactory=TransformerFactory.newInstance();
		Transformer transformer=transformerfactory.newTransformer();
		DOMSource source=new DOMSource(doc);
		StreamResult result=new StreamResult(new File("D:\\File.xml"));
		transformer.transform(source, result);
		System.out.println("File Saved");
	}
    catch (ParserConfigurationException pce) {
	pce.printStackTrace();
} 
	catch (TransformerException tfe) {
	tfe.printStackTrace();

	}
	}
}
