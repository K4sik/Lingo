package com.example.lingo.models;

public class Settings {

    private int img;

    private String title;

    public Settings() {
    }

    public Settings(int img, String title) {
        this.img = img;
        this.title = title;
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
}
