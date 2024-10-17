package ru.courcehb.c5.array;

import java.util.Random;
import java.util.Scanner;

public class JV30 {
    static int m;
    static int n;
    static int l;

    public static void main(String[] args) {
        System.out.println("enter array size");
        m = new Scanner(System.in).nextInt();
        l = new Scanner(System.in).nextInt();

        int[][] array = new int[m][l];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
            }
        }
        printArray(array);

        System.out.println("\nenter number of row");
        n = new Scanner(System.in).nextInt();

        for (int i = 0; i < m; i++) {
            array[i][i] = array[n-1][i];
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