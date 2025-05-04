package com.rnyd.rnyd.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "\"user\"")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "surname", length = 75, nullable = false)
    private String surname;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birth_date;

    @Column(name = "keyword", length = 100, nullable = false)
    private String keyword;

    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
