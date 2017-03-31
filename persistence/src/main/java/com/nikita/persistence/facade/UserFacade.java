package com.nikita.persistence.facade;

import com.nikita.persistence.entities.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserFacade extends AbstractFacade<User> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public UserFacade(){
        super(User.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
