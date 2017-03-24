package com.nikita.persistance.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Photographer extends User implements Serializable{
    
    public Photographer(){
        
    }
    private List<Order> orders;
}
