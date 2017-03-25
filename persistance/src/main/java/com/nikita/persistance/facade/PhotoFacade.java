package com.nikita.persistance.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PhotoFacade extends AbstractFacade<PhotoFacade> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotoFacade(){
        super(PhotoFacade.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
