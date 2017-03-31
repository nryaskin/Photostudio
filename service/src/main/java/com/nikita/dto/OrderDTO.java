package com.nikita.dto;

import java.util.Calendar;
import java.util.List;

public class OrderDTO {
    private Integer id;
    private PhotographerDTO photographer;
    private ClientDTO client;
    private List<PhotoDTO> photos;
    private PavilionDTO pavilion;
    private Calendar orderDate;
    private boolean accepted;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PhotographerDTO getPhotographer() {
        return photographer;
    }

    public void setPhotographer(PhotographerDTO photographer) {
        this.photographer = photographer;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public List<PhotoDTO> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoDTO> photos) {
        this.photos = photos;
    }

    public PavilionDTO getPavilion() {
        return pavilion;
    }

    public void setPavilion(PavilionDTO pavilion) {
        this.pavilion = pavilion;
    }

    public Calendar getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

}
