package org.example;

public class Hotel {
    private String name;
    private String country;
    private String city;
    private int stars;
    private String roomClass;

    public Hotel(String name, String country, String city, int stars, String roomClass) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.stars = stars;
        this.roomClass = roomClass;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Country: " + country + ", City: " + city +
                ", Stars: " + stars + ", Room Class: " + roomClass;
    }
}
