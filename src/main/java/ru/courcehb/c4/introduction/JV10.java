package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV10 {
    static int number;
    static int counter = 0;

    public static void main(String[] args) {
        number = new Scanner(System.in).nextInt();
        if (number >= 0 && number <= 10_000) {
            while (number > 0) {
                number /= 10;
                counter++;
            }
            System.out.println(counter);
        } else System.out.println("invalid data");

    }
}