package com.nikita.persistance.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PhotolabFacade extends AbstractFacade<PhotolabFacade> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotolabFacade(){
        super(PhotolabFacade.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
