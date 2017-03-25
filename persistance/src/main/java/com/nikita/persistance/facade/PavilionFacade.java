package com.nikita.persistance.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PavilionFacade extends AbstractFacade<PavilionFacade> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    
    public PavilionFacade(){
        super(PavilionFacade.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
