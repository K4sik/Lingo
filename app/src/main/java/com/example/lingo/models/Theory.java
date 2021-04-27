package com.example.lingo.models;

public class Theory {

    private int img;

    private String title;

    private int imgStat;

    public Theory() {
    }

    public Theory(int img, String title, int imgStat) {
        this.img = img;
        this.title = title;
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

    public int getImgStat() {
        return imgStat;
    }

    public void setImgStat(int imgStat) {
        this.imgStat = imgStat;
    }
}
