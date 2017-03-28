package com.nikita.persistance.entities;

import java.util.List;
import javax.persistence.Entity;

@Entity
public class Photographer extends User{
    
    public Photographer(){
        
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    private List<Order> orders;
}
