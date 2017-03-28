package com.nikita.persistance.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Pavilion{
    
    public Pavilion(){
        
    }
    
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Photolab> getPhotolabs() {
        return photolabs;
    }

    public void setPhotolabs(List<Photolab> photolabs) {
        this.photolabs = photolabs;
    }
    private List<Photolab> photolabs;
    
}
