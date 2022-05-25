package com.example.sneakersworld.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String name ;
    private String contain;
    private String filename;
    private String filename2;
    private String filename3;
    private String filename4;
    private String filename5;
    private String filename6;
    private String filename7;
    private String filename8;
    private String filename9;
    private String filename10;


    public News() {
    }

    public News(String name, String contain, String finish1, String finish2, String finish3, String finish4, String finish5, String finish6, String finish7, String finish8, String finish9, String finish10) {
        this.name = name;
        this.contain = contain;
        this.filename = finish1;
        this.filename2 = finish2;
        this.filename3 = finish3;
        this.filename4 = finish4;
        this.filename5 = finish5;
        this.filename6 = finish6;
        this.filename7 = finish7;
        this.filename8 = finish8;
        this.filename9 = finish9;
        this.filename10 =finish10;
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

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }


    public String getFilename() {
        return filename;
    }

    public void setFilename(String resultFilename) {
        this.filename = filename;
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

    public String getFilename6() {
        return filename6;
    }

    public void setFilename6(String filename6) {
        this.filename6 = filename6;
    }

    public String getFilename7() {
        return filename7;
    }

    public void setFilename7(String filename7) {
        this.filename7 = filename7;
    }

    public String getFilename8() {
        return filename8;
    }

    public void setFilename8(String filename8) {
        this.filename8 = filename8;
    }

    public String getFilename9() {
        return filename9;
    }

    public void setFilename9(String filename9) {
        this.filename9 = filename9;
    }

    public String getFilename10() {
        return filename10;
    }

    public void setFilename10(String filename10) {
        this.filename10 = filename10;
    }
}
