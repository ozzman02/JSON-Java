package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TreeModelWrite {

	public static void main(String[] args) {
		
		ClassLoader classLoader = TreeModelWrite.class.getClassLoader();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			JsonNode root = objectMapper.readTree(new File(classLoader.getResource("mapJson.json").getFile()));
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
			System.out.println("-------------------------------------------------------------------------------------------");
			
			((ObjectNode) root).remove("array");
			((ObjectNode) root).remove("booleanTrue");
			((ObjectNode) root).remove("booleanFalse");
			
			((ObjectNode) root).put("new key", "new value");
			
			((ObjectNode) root).putArray("newArray");
			((ObjectNode) root).withArray("newArray").add(1);
			((ObjectNode) root).withArray("newArray").add(2);
			((ObjectNode) root).withArray("newArray").add(3);
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
			System.out.println("-------------------------------------------------------------------------------------------");
			
			ArrayNode arrayNode = ((ObjectNode) root).withArray("newArray");
			System.out.println(arrayNode);
			
			System.out.println("-------------------------------------------------------------------------------------------");
			
			((ObjectNode) root).withArray("newArray").removeAll();
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(root));
			
			
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
