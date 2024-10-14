package ru.courcehb.c5.array;

import java.util.Random;
import java.util.Scanner;

public class JV23 {
    public static void main(String[] args) {
        System.out.println("enter lenght of array");
        int arrLenght = new Scanner(System.in).nextInt();
        int[] arr = new int[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            arr[i] = new Random().nextInt(100);
        }

        for (int i = 1; i < arrLenght; i++) {
            if (arr[i] > arr[i - 1]) System.out.print(arr[i] + " ");
        }
    }
}