package com.rnyd.rnyd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"user\"")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
