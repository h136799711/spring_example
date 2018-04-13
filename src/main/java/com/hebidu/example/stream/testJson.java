package com.hebidu.example.stream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.IOException;
import java.io.Serializable;

public class testJson {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"userName123Test\":\"bflee\",\"idNumber\":\"123456\"}";
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        O o = (O) mapper.readValue(json, O.class);
        System.out.println(o.getIdNumber());
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        System.out.println(mapper.writeValueAsString(o));
    }
}

class O implements Serializable {
    private static final long serialVersionUID = -3004824622398622080L;
    private String userName123Test;
    private String idNumber;

    public O() {
    }

    public String getUserName123Test() {
        return userName123Test;
    }

    public void setUserName123Test(String userName123Test) {
        this.userName123Test = userName123Test;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

}
