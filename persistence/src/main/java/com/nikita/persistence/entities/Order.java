package com.nikita.persistence.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order{
    
    public Order(){
        
    }
    @Id
    private Integer id;
    private Photographer photographer;
    private Client client;
    private List<Photo> photos;
    private Pavilion pavilion;
    private Calendar orderDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Photographer getPhotographer() {
        return photographer;
    }

    public void setPhotographer(Photographer photographer) {
        this.photographer = photographer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Pavilion getPavilion() {
        return pavilion;
    }

    public void setPavilion(Pavilion pavilion) {
        this.pavilion = pavilion;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public Calendar getOrderDelicery() {
        return orderDelicery;
    }

    public void setOrderDelicery(Calendar orderDelicery) {
        this.orderDelicery = orderDelicery;
    }
    private Calendar orderDelicery;
    
}
