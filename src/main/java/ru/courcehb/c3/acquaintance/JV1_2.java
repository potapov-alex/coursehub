package ru.courcehb.c3.acquaintance;

import java.util.Scanner;

public class JV1_2 {
    public static void main(String[] args) {
        int time = new Scanner(System.in).nextInt();
        int distance = new Scanner(System.in).nextInt();
        double speed = (double) distance / ((double) time / (double) 60);
        System.out.println(speed);
    }
}