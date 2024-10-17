package ru.courcehb.c5.array;

import java.util.Random;
import java.util.Scanner;

public class JV31 {
    static int m;
    static int n;
    static int r;

    public static void main(String[] args) {
        System.out.println("enter array size");
        m = new Scanner(System.in).nextInt();
        n = new Scanner(System.in).nextInt();
        r = new Scanner(System.in).nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
            }
        }
        System.out.println("your matrix is");
        printArray(array);
        System.out.println("reversed matrix");
        reverseMatrixRows(array,r);
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

    public static void reverseMatrixRows(int[][] matrix, int r) {
        int[] row = matrix[r - 1];
        for (int i = 0, j = row.length - 1; i < j; i++, j--) {
            int temp = row[i];
            row[i] = row[j];
            row[j] = temp;
        }
    }
}