package com.nikita.persistence.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order{
    
    public Order(){
        
    }
    @Id
    @Column(name="order_id")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Photographer photographer;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="order_id")
    private List<Photo> photos;
    
    private Pavilion pavilion;
    
    @Column(name="order_date")
    private Calendar orderDate;
    
    
    private boolean accepted;

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
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

    public Calendar getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(Calendar orderDelivery) {
        this.orderDelivery = orderDelivery;
    }
    
    @Column(name="order_delivery")
    private Calendar orderDelivery;
    
}
