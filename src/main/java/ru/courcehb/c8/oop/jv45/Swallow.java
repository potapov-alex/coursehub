package ru.courcehb.c8.oop.jv45;

public class Swallow implements Bird{
    @Override
    public void flyUp() {
        System.out.println("swallow fly up");
    }

    @Override
    public void landDown() {
        System.out.println("swallow land down");
    }
}