package com.nikita.service;

import com.nikita.persistence.facade.AbstractFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public abstract class CRUDOperation<Entity, DTO> {

    @EJB
    protected Converter converter;

    public Class<DTO> dtoType;

    public Class<Entity> entityType;
    
    public CRUDOperation(Class<Entity> entityType, Class<DTO> dtoType) {
        this.dtoType = dtoType;
        this.entityType = entityType;
    }

    protected abstract AbstractFacade getFacade();

    public void add(DTO dto) {
        getFacade().create(converter.convert(dto, entityType));
    }

    public void remove(DTO dto) {
        getFacade().remove(converter.convert(dto, entityType));
    }

    public List<DTO> getAll() {
        List<DTO> entityDTO = new ArrayList<>();
        List<Entity> ordersEntities = getFacade().findAll();
        for (Entity entity : ordersEntities) {
            entityDTO.add(converter.convert(entity, dtoType));
        }
        return entityDTO;
    }

}
