package com.example.demo.JsonExample;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class JsonDataBinder {
    private static final String jsonExample = "{\n" +
            "  \"id-key\": 1,\n" +
            "  \"test\": 1,\n" +
            "  \"value\": \"File\"\n" +
            "}";

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonExample jsonExample1 = objectMapper.readValue(jsonExample, JsonExample.class);
        System.out.println(jsonExample1.toString());

        JsonExample jsonExample2 = new JsonExample(2, "Test", "null", "Password");
        String s = objectMapper.writeValueAsString(jsonExample2);

        System.out.println(s);
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class JsonExample {
        @JsonProperty(value = "id-key")
        private Integer id;
        @JsonProperty(value = "value")
        private String value;
        @JsonProperty(value = "type")
        private String type;
        @JsonIgnore
        private String password;

        public JsonExample() {
        }

        public JsonExample(Integer id, String value, String type, String password) {
            this.id = id;
            this.value = value;
            this.type = type;
            this.password = password;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "JsonExample{" +
                    "id=" + id +
                    ", value='" + value + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
