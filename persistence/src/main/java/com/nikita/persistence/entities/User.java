package com.nikita.persistence.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_role", discriminatorType = DiscriminatorType.INTEGER)
public class User {

    public User() {
    }

    @Id
    @NotNull
    protected String username;
    @Column(name="passwd")
    @NotNull
    protected String password;
    @Column(name="first_name")
    protected String name;
    @Column(name="middle_name")
    protected String surname;

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

    
    
    @Override
    public boolean equals(Object o){
        
        if (!(o instanceof User)) {
            return false;
        }
        
        User user = (User)o;
        
        return user.username.equals(this.username) 
                && user.password.equals(this.password);
    }
    
}
