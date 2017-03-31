package com.nikita.service;

import com.nikita.dto.PhotographerDTO;
import com.nikita.persistence.entities.Photographer;
import com.nikita.persistence.facade.AbstractFacade;
import com.nikita.persistence.facade.PhotographerFacade;
import java.util.Calendar;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PhotographerService extends CRUDOperation<Photographer, PhotographerDTO> {

    @EJB
    private PhotographerFacade photographerFacade;
    
    public PhotographerService(){
        super(Photographer.class, PhotographerDTO.class);
    }
    
    public List<Calendar> availableTime(PhotographerDTO photographer){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected AbstractFacade getFacade() {
        return photographerFacade;
    }

    
}
