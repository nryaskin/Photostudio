package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Photographer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PhotographerFacade extends AbstractFacade<Photographer> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotographerFacade(){
        super(Photographer.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
