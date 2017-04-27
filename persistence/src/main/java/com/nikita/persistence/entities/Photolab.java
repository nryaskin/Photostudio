package com.nikita.persistence.entities;

import java.util.List;
import java.util.Queue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Photolab {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Photo> getTypedPhotos() {
        return typedPhotos;
    }

    public void setTypedPhotos(List<Photo> typedPhotos) {
        this.typedPhotos = typedPhotos;
    }
    @ManyToMany
    @JoinTable(
            name = "photolab_photo",
            joinColumns = @JoinColumn(name = "photolab_id", referencedColumnName = "photolab_id"),
            inverseJoinColumns = @JoinColumn(name = "photo_id", referencedColumnName = "photo_id"))
    private List<Photo> typedPhotos;

}
