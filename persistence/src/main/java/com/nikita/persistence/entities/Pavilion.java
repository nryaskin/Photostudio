package com.nikita.persistence.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


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
    @OneToMany
    @JoinColumn(name="pavilion_id")
    private List<Photolab> photolabs;
    
}
