package com.nikita.persistance.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order implements Serializable{
    
    public Order(){
        
    }
    @Id
    private Integer id;
    private Photographer photographer;
    private Client client;
    private List<Photo> photos;
    private Pavilion pavilion;
    private Calendar orderDate;
    private Calendar orderDelicery;
    
}
