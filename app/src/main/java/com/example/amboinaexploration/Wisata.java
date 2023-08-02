package com.example.amboinaexploration;

public class Wisata {
    private String name;
    private int image;
    private String description;
    private String place;

    public Wisata(String name, int image, String description, String place) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }
}
