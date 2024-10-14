package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV19 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int powder = new Scanner(System.in).nextInt();
        System.out.println(Math.pow(number, powder));
    }
}