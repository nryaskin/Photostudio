package com.nikita.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Photo{
    
    public Photo(){
        
    }
    
    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }
    
    @Column(name = "photo_type")
    private String phototype;
}
