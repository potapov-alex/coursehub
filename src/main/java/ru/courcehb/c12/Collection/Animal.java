package ru.courcehb.c12.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal> {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        System.out.println("Before sorting:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Collections.sort(animals);

        System.out.println("\nAfter sorting:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}