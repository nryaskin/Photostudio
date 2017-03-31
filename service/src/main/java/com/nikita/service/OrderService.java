package com.nikita.service;

import com.nikita.dto.OrderDTO;
import com.nikita.dto.UserDTO;
import com.nikita.persistence.entities.Order;
import com.nikita.persistence.facade.AbstractFacade;
import com.nikita.persistence.facade.OrderFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class OrderService extends CRUDOperation<Order, OrderDTO> {

    @EJB
    private OrderFacade orderFacade;
    
    @EJB
    private NotificationService notificationService;
    
    public OrderService(){
        super(Order.class, OrderDTO.class);
    }

    public void makeOrder(OrderDTO order) {
        getFacade().create(converter.convert(order, entityType));
        notificationService.notify(order.getPhotographer(), order);
    }

    public void cancelOrder(OrderDTO order) {
        getFacade().edit(converter.convert(order, entityType));
        notificationService.notify(order.getPhotographer(), order);
    }

    public void acceptOrder(OrderDTO order) {
        getFacade().edit(converter.convert(order, dtoType));
        notificationService.notify(order.getClient(), order);
    }

    public List<OrderDTO> getNew(UserDTO user) {
        return chooseOrders(o -> o.getPhotographer()
                .equals(converter.convert(user, entityType)) 
                && !o.isAccepted());
    }

    public List<OrderDTO> getAcceptedOrders(UserDTO user) {
        return chooseOrders(o -> o.getPhotographer()
                .equals(converter.convert(user, entityType))
                && o.isAccepted());
    }

    public List<OrderDTO> getOrders(UserDTO user) {
                return chooseOrders(o -> o.getClient()
                .equals(converter.convert(user, entityType)));
    }

    private List<OrderDTO> chooseOrders(Predicate<Order> predicate){
        List<Order> ordersList = getFacade().findAll();
        List<OrderDTO> dtoList = new ArrayList<>();
        for(Order order : ordersList){
            if(predicate.test(order)){
                dtoList.add(converter.convert(order, dtoType));
            }
        }
        return dtoList;
    }
    
    @Override
    protected AbstractFacade getFacade() {
        return orderFacade;
    }
}
