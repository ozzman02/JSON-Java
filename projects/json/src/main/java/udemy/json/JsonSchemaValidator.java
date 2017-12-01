package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import udemy.json.domain.UdemyLectureSchema;

public class JsonSchemaValidator {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyLectureSchema udemyLectureSchema = new UdemyLectureSchema();
		udemyLectureSchema.setId(1);
		udemyLectureSchema.setName("udemy lecture name");
		udemyLectureSchema.setNameLine2("");
		udemyLectureSchema.setDescription("udemy lecture description");
		udemyLectureSchema.setEnabled(true);
		
		ClassLoader classLoader = JsonSchemaValidator.class.getClassLoader();
		
		try {
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLectureSchema));
			
			JsonNode rootSchema = objectMapper.readTree(new File(classLoader.getResource("schema.json").getFile()));
			
			JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.newBuilder().freeze();
			
			JsonSchema schema = jsonSchemaFactory.getJsonSchema(rootSchema);
			
			JsonNode validate = objectMapper.readTree(new File(classLoader.getResource("udemyLectureValidate.json").getFile()));
			
			System.out.println(schema.validate(validate));
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ProcessingException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
