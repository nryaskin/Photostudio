package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Pavilion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PavilionFacade extends AbstractFacade<Pavilion> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    
    public PavilionFacade(){
        super(Pavilion.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
