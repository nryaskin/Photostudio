package com.nikita.persistance.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Pavilion implements Serializable{
    
    public Pavilion(){
        
    }
    
    @Id
    private Integer id;
    private List<Photolab> photolabs;
    
}
