package com.example.lingo.models;

public class Settings {

    private int img;

    private String title;

    private int imgStat;

    public Settings() {
    }

    public Settings(int img, String title, int imgStat) {
        this.img = img;
        this.title = title;
        this.imgStat = imgStat;
    }

    public int getImg() {
        return img;
    }

    public void setImageResource(int imageResource) {
        this.img = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgStat() {
        return imgStat;
    }

    public void setImgStat(int imgStat) {
        this.imgStat = imgStat;
    }
}
