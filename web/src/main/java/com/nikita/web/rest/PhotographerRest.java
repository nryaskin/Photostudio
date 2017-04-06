package com.nikita.web.rest;

import com.nikita.dto.PhotographerDTO;
import com.nikita.service.PhotographerService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("photographer")
public class PhotographerRest {
    
    @EJB
    private PhotographerService photographerService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PhotographerDTO> getAll(){
        return photographerService.getAll();
    }
    

    @GET
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public PhotographerDTO getById(@PathParam("username") String username){
        return photographerService.findById(username);
    } 
    
    @DELETE
    @Path("/{username}")
    @Produces(MediaType.TEXT_PLAIN)
    public void deleteById(@PathParam("username") String username){
        photographerService.remove(photographerService.findById(username));
    }
}
