package com.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.service.XmlModelIntepreterService;

import java.io.File;


public class Example {
	
	
    public static void main(String[] args) {
        try {
            // Create JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);

            // Create Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Example instance = new Example();
            // Load XML file
            File xmlFile = new File("/Users/facundomerighi/workspace/workspace_day5/java_ws/AdapterXMLtoJSon/example.xml");

            // Unmarshal XML to Java object
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);


            // Access and display book details
            Element rootElement = document.getDocumentElement();
            XmlModelIntepreterService modelInterpreter = new XmlModelIntepreterService();
            modelInterpreter.parse(rootElement);
            


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}