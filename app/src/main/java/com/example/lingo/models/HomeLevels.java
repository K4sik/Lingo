package com.example.lingo.models;

public class HomeLevels {

    private int img;

    private int imgTitle;

    private String title;

    private int imgStat;

    public HomeLevels() {
    }

    public HomeLevels(int img, int imgTitle, String title, int imgStat) {
        this.img = img;
        this.imgTitle = imgTitle;
        this.title = title;
        this.imgStat = imgStat;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(int imgTitle) {
        this.imgTitle = imgTitle;
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
