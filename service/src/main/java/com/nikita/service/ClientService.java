package com.nikita.service;

import com.nikita.dto.ClientDTO;
import com.nikita.persistence.entities.Client;
import com.nikita.persistence.facade.AbstractFacade;
import com.nikita.persistence.facade.ClientFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClientService extends CRUDOperation<Client, ClientDTO> {

    @EJB
    private ClientFacade clientFacade;
    
    public ClientService(){
        super(Client.class, ClientDTO.class);
    }
    
    @Override
    protected AbstractFacade getFacade() {
        return clientFacade;
    }
    
}
