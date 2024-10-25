package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV14 {
    static int number;
    static int exp;

    public static void main(String[] args) {
        number = new Scanner(System.in).nextInt();
        exp = 1;
        do {
            System.out.println(Math.pow(exp, 2));
            exp++;
        } while (Math.pow(exp, 2) <= number);
    }
}