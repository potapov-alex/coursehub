package ru.courcehb.c5.array;

import java.util.Scanner;

public class JV24 {
    public static void main(String[] args) {
        System.out.println("enter lenght of array");
        int arrLenght = new Scanner(System.in).nextInt();
        int[] arr = new int[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        for (int i = 1; i < arrLenght; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}