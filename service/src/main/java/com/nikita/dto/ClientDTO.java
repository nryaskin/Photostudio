package com.nikita.dto;

import java.util.List;

public class ClientDTO extends UserDTO{
    private List<OrderDTO> orders;

    public List<OrderDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDTO> orders) {
        this.orders = orders;
    }
}
