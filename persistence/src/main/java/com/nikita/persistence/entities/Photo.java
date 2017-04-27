package com.nikita.persistence.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Photo{
    
    public Photo(){
        
    }
    
    @Id
    @Column(name="photo_id")
    @GeneratedValue
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
    
    @ManyToMany(mappedBy="typedPhotos")
    private List<Photolab> photolabs;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public List<Photolab> getPhotolabs() {
        return photolabs;
    }

    public void setPhotolabs(List<Photolab> photolabs) {
        this.photolabs = photolabs;
    }
}
