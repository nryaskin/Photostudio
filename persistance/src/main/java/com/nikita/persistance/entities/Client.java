package com.nikita.persistance.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Client extends User implements Serializable {
    
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
