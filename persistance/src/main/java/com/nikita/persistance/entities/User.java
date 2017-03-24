package com.nikita.persistance.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User implements Serializable{
    public User(){}
    
    @Id
    private String username;
    private String password;
    private String name;
    private String surname;
    
}
