/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nikita.web.controller;

import com.nikita.dto.PhotographerDTO;
import com.nikita.service.PhotographerService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Никита
 */
public class UserController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/jsp/user.jsp";
    private static String LIST_USER = "/jsp/listUser.jsp";
    
    @EJB
    private PhotographerService photographerService;

    public UserController() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            String username = request.getParameter("username");
            photographerService.remove(photographerService.findById(username));
            forward = LIST_USER;
            request.setAttribute("users", photographerService.getAll());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String username = request.getParameter("username");
            PhotographerDTO user = photographerService.findById(username);
            request.setAttribute("user", user);
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_USER;
            request.setAttribute("users", photographerService.getAll());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PhotographerDTO user = new PhotographerDTO();
        user.setName(request.getParameter("firstName"));
        user.setSurname(request.getParameter("lastName"));
        user.setPassword(request.getParameter("password"));
        String username = request.getParameter("username");
        if(username == null || username.isEmpty())
        {
            
        }
        else
        {
            user.setUsername(username);
            photographerService.add(user);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("users", photographerService.getAll());
        view.forward(request, response);
    }
}
