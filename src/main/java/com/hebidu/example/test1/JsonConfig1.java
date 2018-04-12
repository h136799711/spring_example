package com.hebidu.example.test1;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class JsonConfig1 {
    public static class Serializer extends JsonSerializer<Config1> {
        @Override
        public void serialize(Config1 config1, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeObject(config1);
        }
    }

    public static class Deserializer extends JsonDeserializer<Config1> {
        @Override
        public Config1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            return null;
        }
    }
}
