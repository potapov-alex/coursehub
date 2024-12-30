package ru.courcehb.c8.oop.jv43;

public class Circle {
    double PI = Math.PI;
    double radius;
    double square = PI * Math.pow(radius, 2);
    double circumference = 2 * PI * radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}