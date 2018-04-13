package com.hebidu.example.test1;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Test1Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Test1Main.class);

    @Value("${hebidu.json.prop_naming_style}")
    private String jsonPropNamingStyle;

    /**
     * json转下划线
     *
     * @return MappingJackson2HttpMessageConverter
     */
    @Bean
    public MappingJackson2HttpMessageConverter getMappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        //设置日期格式

        ObjectMapper objectMapper = new ObjectMapper();
        SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
        objectMapper.setDateFormat(smt);
        LOGGER.error("json.prop.naming.style= " + LOGGER.getClass().toString());
        LOGGER.info("json.prop.naming.style= " + jsonPropNamingStyle);
        if (jsonPropNamingStyle.equalsIgnoreCase("snake_case")) {
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        } else {
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.LOWER_CAMEL_CASE);
        }

        mappingJackson2HttpMessageConverter.setObjectMapper(objectMapper);
        //设置中文编码格式
        List<MediaType> list = new ArrayList<>();
        list.add(MediaType.APPLICATION_JSON_UTF8);
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
        return mappingJackson2HttpMessageConverter;
    }



    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Test1Main.class);
        app.run(args);

        System.out.println("Web Application Type " + app.getWebApplicationType().name());
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

}
