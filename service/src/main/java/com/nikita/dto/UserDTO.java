package com.nikita.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

public class UserDTO implements Serializable{

    private String username;
    //@JsonIgnore
    private String password;
    private String name;
    private String surname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
}
