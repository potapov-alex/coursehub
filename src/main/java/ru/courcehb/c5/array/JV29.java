package ru.courcehb.c5.array;

import java.util.Random;
import java.util.Scanner;

public class JV29 {
    static int m;
    static int n;

    public static void main(String[] args) {
        m = new Scanner(System.in).nextInt();
        n = new Scanner(System.in).nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(21);
                array[i][j] *= 3;
            }
        }
        printArray(array);
    }

    private static void printArray(int[][] arr) {
        for (int[] m : arr) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}