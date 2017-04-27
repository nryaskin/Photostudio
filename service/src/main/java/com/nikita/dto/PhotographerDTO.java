package com.nikita.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.List;

public class PhotographerDTO extends UserDTO implements Serializable {

    public PhotographerDTO(){
    }
    
    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
    
    @JsonManagedReference
    private List<OrderDTO> orders;
}
