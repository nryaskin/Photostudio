package com.nikita.persistance.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Client extends User implements Serializable {
    
    public Client(){
        
    }
    
    private List<Order> orders;
    
}
