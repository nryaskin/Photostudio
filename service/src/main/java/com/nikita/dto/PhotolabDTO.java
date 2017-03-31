package com.nikita.dto;

import java.util.List;
import java.util.Queue;

public class PhotolabDTO {

    private Integer id;
    private boolean isWorking;
    private Queue<PhotoDTO> activePhotos;
    private List<PhotoDTO> typedPhotos;

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

    public Queue<PhotoDTO> getActivePhotos() {
        return activePhotos;
    }

    public void setActivePhotos(Queue<PhotoDTO> activePhotos) {
        this.activePhotos = activePhotos;
    }

    public List<PhotoDTO> getTypedPhotos() {
        return typedPhotos;
    }

    public void setTypedPhotos(List<PhotoDTO> typedPhotos) {
        this.typedPhotos = typedPhotos;
    }
}
