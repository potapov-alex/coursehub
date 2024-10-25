package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV16 {
    static int number;
    static int powder;

    public static void main(String[] args) {
        number = new Scanner(System.in).nextInt();
        powder = new Scanner(System.in).nextInt();
        System.out.println(Math.pow(number, powder));
    }
}