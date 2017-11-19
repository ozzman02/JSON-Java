package udemy.json;

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
		
		try {
			System.out.println(objectMapper.writeValueAsString(udemyStudent));
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyStudent));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
