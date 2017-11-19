package udemy.json;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingRead {

	public static void main(String[] args) {
		
		final String fileName = "mapJson.json";
		
		ObjectMapper objectMapper = new ObjectMapper();

		String udemyStudentJson = "{" + "\"id\" : 2," + "\"name\" : \"Bellamy\"," + "\"lastName\" : \"Santamaria\"" + "}";
		
		try {
			
			UdemyStudent udemyStudent = objectMapper.readValue(udemyStudentJson, UdemyStudent.class);
			System.out.println("id: " + udemyStudent.getId());
			System.out.println("name: " + udemyStudent.getName());
			System.out.println("last name: " + udemyStudent.getLastName());
			
			ClassLoader classLoader = DataBindingRead.class.getClassLoader();
			
			Map<String, Object> mapJson = objectMapper.readValue(
					new File(classLoader.getResource(fileName).getFile()),
					new TypeReference<Map<String, Object>>() {}
				);
			
			System.out.println(mapJson);
			
			for (Map.Entry<String, Object> entry : mapJson.entrySet()) {
				System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
			}
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
