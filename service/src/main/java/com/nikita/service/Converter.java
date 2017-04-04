package com.nikita.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

@Singleton
public class Converter {

    Mapper mapper;

    public Converter() {
        List myMappingFiles = new ArrayList();
        myMappingFiles.add("dozer/photostudiodozer.xml");
        DozerBeanMapper mymapper = new DozerBeanMapper();
        mymapper.setMappingFiles(myMappingFiles);
        mapper = mymapper;
    }

    public <T> T convert(Object source, Class<T> classType) {
        return mapper.map(source, classType);
    }

}
