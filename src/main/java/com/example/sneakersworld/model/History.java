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
    private String text;
    private String main_photo;

    public History(String name,String text ,String finish_name) {
        this.name = name;
        this.text = text;
        this.main_photo = finish_name;
    }

    public History() {
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


    public String getMain_photo() {
        return main_photo;
    }

    public void setMain_photo(String main_photo) {
        this.main_photo = main_photo;
    }
}
