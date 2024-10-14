package ru.courcehb.c5.array;

import java.util.Scanner;

public class JV25 {
    static int minElementOfArray = Integer.MAX_VALUE;
    static int indexOfMinimalElement;

    public static void main(String[] args) {
        System.out.println("enter lenght of array");
        int arrLenght = new Scanner(System.in).nextInt();
        int[] arr = new int[arrLenght];


        for (int i = 0; i < arrLenght; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        for (int i = 0; i < arrLenght; i++) {
            if (arr[i] <= minElementOfArray) {
                minElementOfArray = arr[i];
                indexOfMinimalElement = i;
            }
        }
        System.out.println(indexOfMinimalElement);
    }
}