package com.rnyd.rnyd.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class UserProgressDTO {

    @JsonProperty("imageFile")
    private byte[] imageFile;

    @JsonProperty("imagePath")
    private String imagePath;

    @JsonProperty("weight")
    private Double weight;

    @JsonProperty("neck")
    private Double neck;

    @JsonProperty("shoulders")
    private Double shoulders;

    @JsonProperty("chest")
    private Double chest;

    @JsonProperty("waist")
    private Double waist;

    @JsonProperty("hips")
    private Double hips;

    @JsonProperty("thigh")
    private Double thigh;

    @JsonProperty("calf")
    private Double calf;



    @JsonProperty("height")
    private Double height;

    @JsonProperty("progressDate")
    private LocalDate progressDate;

    // Getters y setters

    public byte[] getImageFile() {
        return imageFile;
    }

    public void setImageFile(byte[] imageFile) {
        this.imageFile = imageFile;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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

    public Double getNeck() {
        return neck;
    }

    public void setNeck(Double neck) {
        this.neck = neck;
    }
}
