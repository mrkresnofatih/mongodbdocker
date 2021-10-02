package com.fatstack.mongodbdocker.configs;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    public ObjectMapper getMapper(){
        ObjectMapper objMapper = new ObjectMapper();
        objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objMapper;
    }
}
