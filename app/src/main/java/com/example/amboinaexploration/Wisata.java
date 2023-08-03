package com.example.amboinaexploration;


public class Wisata {
    private String name;
    private int image;
    private String description;
    private double latitude;
    private double longitude;
    private String mapUrl;

    public Wisata(String name, int image, String description, double latitude, double longitude, String mapUrl) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mapUrl = mapUrl;
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

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getMapUrl() {
        return mapUrl;
    }
}
