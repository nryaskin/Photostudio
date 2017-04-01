package com.nikita.persistence.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value="1")
public class Client extends User{
    
    public Client(){
        
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy="username")
    private List<Order> orders;
    
}
