package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Client;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClientFacade extends AbstractFacade<Client> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public ClientFacade(){
        super(Client.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
