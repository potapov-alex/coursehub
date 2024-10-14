package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV18 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        int i = 2;
        while (i < number) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}