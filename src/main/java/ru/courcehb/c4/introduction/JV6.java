package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV6 {
    static int[] numbers = new int[3];
    static int evenCounter = 0;

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
            if (numbers[i] % 2 != 0) evenCounter++;
        }
        if (evenCounter != 1) System.out.println("data invalid");
        else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) System.out.println(i+1);
            }
        }
    }
}