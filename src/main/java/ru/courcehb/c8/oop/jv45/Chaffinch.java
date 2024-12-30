package ru.courcehb.c8.oop.jv45;

public class Chaffinch implements Bird{
    @Override
    public void flyUp() {
        System.out.println("Chaffinch fly up");
    }

    @Override
    public void landDown() {
        System.out.println("Chaffinch land down");
    }
}