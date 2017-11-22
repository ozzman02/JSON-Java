package udemy.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class StreamingAPI_JsonParser {

	public static void main(String[] args) {
		
		final String FILE_NAME = "jsongenerator_output.json";
		
		JsonFactory jsonFactory = new JsonFactory();
		
		ClassLoader classLoader = StreamingAPI_JsonParser.class.getClassLoader();
		
		try {
			
			JsonParser jsonParser = jsonFactory.createParser(new File(classLoader.getResource(FILE_NAME).getFile()));
			
			while (jsonParser.nextToken() != null) {
				JsonToken jsonToken = jsonParser.getCurrentToken();
				//System.out.println(jsonToken);
				if (jsonToken.equals(JsonToken.FIELD_NAME)) {
					String fieldName = jsonParser.getCurrentName();
					jsonParser.nextToken();
					if (fieldName.equals("object")) {
						while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
							String nameField = jsonParser.getCurrentName();
							jsonParser.nextToken();
							if (nameField.equals("id")) {
								System.out.println("id: " + jsonParser.getValueAsString());
							} else if (nameField.equals("name")) {
								System.out.println("name: " + jsonParser.getValueAsString());
							} else if (nameField.equals("lastName")) {
								System.out.println("lastName: " + jsonParser.getValueAsString());
							}
						}
					}
					if (fieldName.equals("array")) {
						while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
							if (jsonParser.getCurrentToken().equals(JsonToken.START_OBJECT)) {
								while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
									jsonParser.nextToken();
									System.out.println(jsonParser.getValueAsString());
								}
							} else {
								System.out.println(jsonParser.getValueAsString());
							}
							
						}
					}
				}
			}
			
			jsonParser.close();
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
