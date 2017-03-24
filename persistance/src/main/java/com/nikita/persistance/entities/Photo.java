package com.nikita.persistance.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Photo implements Serializable{
    
    public Photo(){
        
    }
    
    @Id
    private Integer id;
    private String address;
    private String phototype;
}
