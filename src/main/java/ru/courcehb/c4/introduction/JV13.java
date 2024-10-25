package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV13 {

    public static void main(String[] args) {

        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        char sign = new Scanner(System.in).next().charAt(0);

        switch (sign) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Incorrect sign");
        }
    }
}