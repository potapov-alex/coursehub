package ru.courcehb.c3.acquaintance;

import java.time.LocalTime;
import java.util.Scanner;

public class JV4 {
    static int distance;
    static int speed;
    static double timeInDouble;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a distance: ");
            distance = new Scanner(System.in).nextInt();
            System.out.print("Enter a speed: ");
            speed = new Scanner(System.in).nextInt();
            if (speed <= 0) {
                System.out.println("Incorrect data.Speed must be more than 0. Try again");
            } else {
                timeInDouble = (double) distance / (double) speed;
                break;
            }
        }
        int hours = (int) timeInDouble;
        int minutes = (int) ((timeInDouble - hours) * 60);
        LocalTime time = LocalTime.of(hours, minutes);
        System.out.println("Time: " + time);
    }
}