package com.nikita.web.rest;

import com.nikita.dto.OrderDTO;
import com.nikita.service.ClientService;
import com.nikita.service.OrderService;
import com.nikita.service.PhotographerService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("order")
public class OrderRest {
    
    @EJB
    private OrderService orderService;
    
    @EJB 
    private ClientService clientService; 
    
    @EJB
    private PhotographerService photographerService;
    
    
    @GET
    @Path("/client/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrderDTO> getForClient(@PathParam("username")String username){
        return orderService.getOrders(clientService.findById(username));
    }
    
    @GET
    @Path("/photographer/new/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrderDTO> getNewForPhotographer(@PathParam("username")String username) {
        return orderService.getNew(photographerService.findById(username));
    }
    
    @GET
    @Path("/photographer/accepted/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<OrderDTO> getAcceptedForPhotographer(@PathParam("username")String username) {
        return orderService.getAcceptedOrders(photographerService.findById(username));
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateOrder(OrderDTO order){
        try {
            OrderDTO tmp = orderService.findById(order.getId());
            order.setClient(tmp.getClient());
            order.setPhotographer(tmp.getPhotographer());
            orderService.update(order);
        }catch(Exception ex){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.OK).build();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response makeOrder(OrderDTO order){
        try{
            orderService.makeOrder(order);
        }
        catch(Exception ex){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return Response.status(Response.Status.CREATED).build();
    }
}
