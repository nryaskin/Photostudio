package com.nikita.persistance.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PhotographerFacade extends AbstractFacade<PhotographerFacade> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotographerFacade(){
        super(PhotographerFacade.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
