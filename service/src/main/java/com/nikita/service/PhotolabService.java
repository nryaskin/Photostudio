package com.nikita.service;

import com.nikita.dto.PhotolabDTO;
import com.nikita.persistence.entities.Photolab;
import com.nikita.persistence.facade.AbstractFacade;
import com.nikita.persistence.facade.PhotolabFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class PhotolabService extends CRUDOperation<Photolab, PhotolabDTO> {

    @EJB
    private PhotolabFacade photolabFacade;
    
    public PhotolabService(){
        super(Photolab.class, PhotolabDTO.class);
    }
    
    public void print(PhotolabDTO photolab){
        
    }

    @Override
    protected AbstractFacade getFacade() {
        return photolabFacade;
    }
    
}
