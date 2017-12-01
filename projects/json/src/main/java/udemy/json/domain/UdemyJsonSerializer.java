package udemy.json.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class UdemyJsonSerializer extends JsonSerializer<UdemyJson>{

	@Override
	public void serialize(UdemyJson udemyJson, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
	
		jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
		
		jsonGenerator.writeStartObject();
		
		jsonGenerator.writeFieldName("custom serialize");
		jsonGenerator.writeString("udemy json");
		
		jsonGenerator.writeStringField("udemyjson_id", "custom prefix " + udemyJson.getId());
		jsonGenerator.writeStringField("udemyjson_key1", "custom prefix " + udemyJson.getKey1());
		jsonGenerator.writeStringField("udemyjson_key2", "custom prefix " + udemyJson.getKey2());
		jsonGenerator.writeStringField("udemyjson_date", "custom prefix " + udemyJson.getDate());
		
		jsonGenerator.writeEndObject();
	}

}
