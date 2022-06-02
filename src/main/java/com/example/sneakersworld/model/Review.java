package com.example.sneakersworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    private String text_full;
    private String filename1;
    private String filename2;
    private String filename3;
    private String filename4;
    private String filename5;

    public Review() {
    }

    public Review(String name, String text_full, String filename1, String filename2, String filename3, String filename4, String filename5) {
        this.name = name;
        this.text_full = text_full;
        this.filename1 = filename1;
        this.filename2 = filename2;
        this.filename3 = filename3;
        this.filename4 = filename4;
        this.filename5 = filename5;
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

    public String getText_full() {
        return text_full;
    }

    public void setText_full(String text_full) {
        this.text_full = text_full;
    }

    public String getFilename1() {
        return filename1;
    }

    public void setFilename1(String filename1) {
        this.filename1 = filename1;
    }

    public String getFilename2() {
        return filename2;
    }

    public void setFilename2(String filename2) {
        this.filename2 = filename2;
    }

    public String getFilename3() {
        return filename3;
    }

    public void setFilename3(String filename3) {
        this.filename3 = filename3;
    }

    public String getFilename4() {
        return filename4;
    }

    public void setFilename4(String filename4) {
        this.filename4 = filename4;
    }

    public String getFilename5() {
        return filename5;
    }

    public void setFilename5(String filename5) {
        this.filename5 = filename5;
    }
}
