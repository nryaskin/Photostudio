package com.nikita.persistance.entities;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhototype() {
        return phototype;
    }

    public void setPhototype(String phototype) {
        this.phototype = phototype;
    }
    private String address;
    private String phototype;
}
