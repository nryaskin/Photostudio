package com.nikita.persistance.entities;

import java.util.List;
import java.util.Queue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Photolab {
    
    @Id
    private Integer id;
    private boolean isWorking;
    private Queue<Photo> activePhotos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isIsWorking() {
        return isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    public Queue<Photo> getActivePhotos() {
        return activePhotos;
    }

    public void setActivePhotos(Queue<Photo> activePhotos) {
        this.activePhotos = activePhotos;
    }

    public List<Photo> getTypedPhotos() {
        return typedPhotos;
    }

    public void setTypedPhotos(List<Photo> typedPhotos) {
        this.typedPhotos = typedPhotos;
    }
    private List<Photo> typedPhotos;
    
}
