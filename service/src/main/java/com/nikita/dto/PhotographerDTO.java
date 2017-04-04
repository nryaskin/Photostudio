package com.nikita.dto;

import java.util.ArrayList;
import java.util.List;

public class PhotographerDTO extends UserDTO {

    public PhotographerDTO(){
    }
    
    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
    private List<OrderDTO> orders;
}
