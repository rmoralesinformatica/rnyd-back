package com.rnyd.rnyd.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "user_progress")
@Data
public class UserProgressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(name = "image_url")
    private String imageUrl;

    private Double weight;
    private Double height;
    private LocalDate progressDate;

    private Double neck;
    private Double shoulders;
    private Double chest;
    private Double waist;
    private Double hips;
    private Double thigh;
    private Double calf;

    public UserProgressEntity() {}

    public UserProgressEntity(UserEntity user, String imageUrl, Double weight, Double height, LocalDate progressDate,
                              Double neck, Double shoulders, Double chest, Double waist, Double hips, Double thigh, Double calf) {
        this.user = user;
        this.imageUrl = imageUrl;
        this.weight = weight;
        this.height = height;
        this.progressDate = progressDate;
        this.neck = neck;
        this.shoulders = shoulders;
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
        this.thigh = thigh;
        this.calf = calf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public LocalDate getProgressDate() {
        return progressDate;
    }

    public void setProgressDate(LocalDate progressDate) {
        this.progressDate = progressDate;
    }

    public Double getNeck() {
        return neck;
    }

    public void setNeck(Double neck) {
        this.neck = neck;
    }

    public Double getShoulders() {
        return shoulders;
    }

    public void setShoulders(Double shoulders) {
        this.shoulders = shoulders;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getHips() {
        return hips;
    }

    public void setHips(Double hips) {
        this.hips = hips;
    }

    public Double getThigh() {
        return thigh;
    }

    public void setThigh(Double thigh) {
        this.thigh = thigh;
    }

    public Double getCalf() {
        return calf;
    }

    public void setCalf(Double calf) {
        this.calf = calf;
    }
}
