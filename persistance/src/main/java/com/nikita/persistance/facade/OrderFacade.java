package com.nikita.persistance.facade;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderFacade extends AbstractFacade<OrderFacade> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public OrderFacade(){
        super(OrderFacade.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
