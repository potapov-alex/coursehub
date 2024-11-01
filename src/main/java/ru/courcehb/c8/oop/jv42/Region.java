package ru.courcehb.c8.oop.jv42;

public class Region extends State {
    String region;

    public Region(String stateName, String region) {
        super(stateName);
        this.region = region;
    }
}