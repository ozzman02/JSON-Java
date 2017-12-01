package udemy.json;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingWrite {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("Oscar");
		udemyStudent.setLastName("Santamaria");
		
		UdemyStudent udemyStudent2 = new UdemyStudent();
		udemyStudent2.setId(2);
		udemyStudent2.setName("Bellamy");
		udemyStudent2.setLastName("Santamaria");
		
		try {
			System.out.println(objectMapper.writeValueAsString(udemyStudent));
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyStudent));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		Map<String, Object> mapJson = new LinkedHashMap<String, Object>();
		
		mapJson.put("key1", "value1");
		mapJson.put("key2", "value2");
		mapJson.put("key3", "value3");
		mapJson.put("booleanTrue", true);
		mapJson.put("booleanFalse", false);
		mapJson.put("array", new String[] {"1", "2", "3"});
		mapJson.put("arrayOfObjects", new UdemyStudent[] {udemyStudent, udemyStudent2});
		mapJson.put("nestedObject", udemyStudent);
		mapJson.put("integer", 1);
		mapJson.put("valueNull", null);
		mapJson.put("list", Arrays.asList("1", "2", "3"));
		mapJson.put("date", LocalDateTime.now().toString());
		
		final String PATH = "src/main/resources/mapJson.json";
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJson));
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(PATH), mapJson);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
