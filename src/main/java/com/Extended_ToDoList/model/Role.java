package com.Extended_ToDoList.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
public class Role {


    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<User> user;

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }
}


