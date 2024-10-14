package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV5_1 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        if (a == b && a == c && b == c) System.out.println(3);
        else if (a == b || a == c || b == c) System.out.println(2);
        else System.out.println(0);
    }
}