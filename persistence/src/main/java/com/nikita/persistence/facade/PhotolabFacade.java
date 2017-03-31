package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Photolab;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PhotolabFacade extends AbstractFacade<Photolab> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotolabFacade(){
        super(Photolab.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
