package com.nikita.service;

import javax.ejb.Singleton;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

@Singleton
public class Converter {
    
    Mapper mapper;
    
    public Converter(){
        mapper = new DozerBeanMapper();
        
    }
    
    public <T> T convert(Object source, Class<T> classType){
        return mapper.map(source, classType);
    }
    
}
