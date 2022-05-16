package com.example.sneakersworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    private String historyPage;
    private String urlPicture;
    private String picture;
    private String text;

    public History(String name, String historyPage, String urlPicture,String picture,String text) {
        this.name = name;
        this.historyPage = historyPage;
        this.urlPicture = urlPicture;
        this.picture = picture;
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public String getHistoryPage() {
        return historyPage;
    }

    public void setHistoryPage(String historyPage) {
        this.historyPage = historyPage;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public History() {
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", historyPage='" + historyPage + '\'' +
                ", urlPicture='" + urlPicture + '\'' +
                ", picture='" + picture + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
