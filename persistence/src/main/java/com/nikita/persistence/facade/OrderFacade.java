package com.nikita.persistence.facade;

import com.nikita.persistence.entities.Order;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class OrderFacade extends AbstractFacade<Order> {

    @PersistenceContext(unitName="com.nikita_persistance_jar_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public OrderFacade(){
        super(Order.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
