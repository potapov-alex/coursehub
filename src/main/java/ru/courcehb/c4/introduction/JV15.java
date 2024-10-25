package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV15 {
    static int number;
    static int div;

    public static void main(String[] args) {
        number = new Scanner(System.in).nextInt();
        div = number - 1;
        while (div >= 2) {
            if (number % div == 0) {
                System.out.println(div);
                break;
            }
            div--;
        }
    }
}