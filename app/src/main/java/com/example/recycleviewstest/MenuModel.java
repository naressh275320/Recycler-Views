package com.example.recycleviewstest;

public class MenuModel {
    String id;
    String name;
    String author;
    String year;
    public MenuModel(String id, String name, String author, String year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public String getYear() {
        return year;
    }
}

