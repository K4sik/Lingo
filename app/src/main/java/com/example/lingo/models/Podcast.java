package com.example.lingo.models;

public class Podcast {

    private int img;

    private String title;

    private String description;

    private int imgStat;

    public Podcast() { }

    public Podcast(int img, String title, String description, int imgStat) {
        this.img = img;
        this.title = title;
        this.description = description;
        this.imgStat = imgStat;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImgStat() {
        return imgStat;
    }

    public void setImgStat(int imgStat) {
        this.imgStat = imgStat;
    }
}
