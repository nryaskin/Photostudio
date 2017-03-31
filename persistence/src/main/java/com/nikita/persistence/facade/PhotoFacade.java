package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Photo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PhotoFacade extends AbstractFacade<Photo> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public PhotoFacade(){
        super(Photo.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
