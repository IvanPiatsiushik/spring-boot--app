package com.example.sneakersworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    private String historyPage;
    private String urlPicture;

    public History(String name, String historyPage, String urlPicture) {
        this.name = name;
        this.historyPage = historyPage;
        this.urlPicture = urlPicture;
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
}
