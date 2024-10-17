package ru.courcehb.c4.introduction;


import java.util.Scanner;

public class JV9 {
    static double[] numbers = new double[5];


    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextDouble();
        }

        double goodPrice = numbers[0] + (numbers[1] / 100);
        double moneyHave = numbers[2] + (numbers[3] / 100);
        double moneyNeeded = goodPrice * (numbers[4]);

        if (moneyNeeded <= moneyHave) System.out.println("true");
        else System.out.println("false");
    }
}