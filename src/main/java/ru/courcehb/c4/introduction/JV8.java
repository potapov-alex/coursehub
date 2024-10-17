package ru.courcehb.c4.introduction;


import java.util.Scanner;

public class JV8 {
    static double[] numbers = new double[6];


    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextDouble();
        }

        double timeCurrent = numbers[0] + (numbers[1] / 60);
        double timeCutdown = numbers[2] + (numbers[3] / 60);
        double timeLeft = numbers[4] + (numbers[5] / 60);

        if (timeLeft <= timeCutdown - timeCurrent) System.out.println("true");
        else System.out.println("false");
    }
}