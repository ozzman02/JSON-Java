package udemy.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
//import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

public class XmlJaxb {

	public static void main(String[] args) {
		
		XmlMapper xmlMapper = new XmlMapper();
		
		xmlMapper.setAnnotationIntrospector(new JaxbAnnotationIntrospector(xmlMapper.getTypeFactory()));
		
		/*
		 * 	Another way of setting it is:
		 * 
		 * 	xmlMapper.registerModule(new JaxbAnnotationModule());
		 * 
		 */
		
		String content = "<xml attribute=\"attribute value\"><name>Oscar S</name><name2></name2><name4></name4></xml>";
		
		try {
			
			System.out.println(xmlMapper.writeValueAsString(new XML()));
			
			XML xml = xmlMapper.readValue(content, XML.class);
			
			System.out.println("attribute: " + xml.getAttribute());
			System.out.println("property1: " + xml.getProperty1());
			System.out.println("property2: " + xml.getProperty2());
			System.out.println("property4: " + xml.getProperty4());
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} 

	}

}
