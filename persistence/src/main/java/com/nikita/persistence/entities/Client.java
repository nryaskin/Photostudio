package com.nikita.persistence.entities;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class Client extends User{
    
    public Client(){
        
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    private List<Order> orders;
    
}
