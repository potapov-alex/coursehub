package ru.courcehb.c5.array;

import java.util.Scanner;

public class JV26 {
    static int minElementOfArray = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println("enter lenght of array");
        int arrLenght = new Scanner(System.in).nextInt();
        int[] arr = new int[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        for (int i = 0; i < arrLenght; i++) {
            if (arr[i] <= minElementOfArray && (double) arr[i] % 2 == 0) {
                minElementOfArray = arr[i];
            }
        }

        for (int i = 0; i < arrLenght; i++) {
           double quotient = (double) arr[i] / (double) minElementOfArray;
            System.out.print(quotient + " ");
        }
    }
}