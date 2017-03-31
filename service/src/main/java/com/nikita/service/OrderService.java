package com.nikita.service;

import com.nikita.dto.OrderDTO;
import com.nikita.dto.UserDTO;
import com.nikita.persistence.entities.Order;
import com.nikita.persistence.facade.AbstractFacade;
import com.nikita.persistence.facade.OrderFacade;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class OrderService extends CRUDOperation<Order, OrderDTO> {

    @EJB
    OrderFacade orderFacade;
    
    public OrderService(){
        super(Order.class, OrderDTO.class);
    }

    public void makeOrder(OrderDTO order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cancelOrder(OrderDTO order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void acceptOrder(OrderDTO order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<OrderDTO> getNew(UserDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.    
    }

    public List<OrderDTO> getAcceptedOrders(UserDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<OrderDTO> getOrders(UserDTO user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected AbstractFacade getFacade() {
        return orderFacade;
    }
}
