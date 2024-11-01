package ru.courcehb.c8.oop.jv42;

public class City extends State {
    String city;

    public City(String stateName, String city) {
        super(stateName);
        this.city = city;
    }
}