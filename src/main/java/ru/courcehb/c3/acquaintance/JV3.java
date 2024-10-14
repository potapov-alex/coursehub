package ru.courcehb.c3.acquaintance;

import java.util.Scanner;

public class JV3 {
    static int number;
    static int sum;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a number: ");
            number = new Scanner(System.in).nextInt();
            if (number < 999 || number > 10_000) {
                System.out.println("Incorrect data. Enter the number between 1000 & 10000");
            } else {
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
                System.out.println(sum);
                break;
            }
        }
    }
}