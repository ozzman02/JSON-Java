package udemy.json.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class UdemyJsonDeserializer extends JsonDeserializer<UdemyJson> {

	@Override
	public UdemyJson deserialize(JsonParser jsonParser, DeserializationContext context)
			throws IOException, JsonProcessingException {
		
		ObjectCodec objectCodec = jsonParser.getCodec();
		
		JsonNode root = objectCodec.readTree(jsonParser);
		
		UdemyJson udemyJson = new UdemyJson();
		
		udemyJson.setId(Long.valueOf(root.get("udemyjson_id").asText().replace("custom prefix ", "")));
		udemyJson.setKey1(root.get("udemyjson_key1").asText());
		udemyJson.setKey2(root.get("udemyjson_key2").asText());
		

		return udemyJson;
	}
	
}
