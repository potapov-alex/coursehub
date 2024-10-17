package ru.courcehb.c5.array;

import java.util.Arrays;
import java.util.Scanner;

public class JV27 {
    public static void main(String[] args) {

        int size = new Scanner(System.in).nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(array);
        int counter = 1;

        for (int i = 1; i < size; i++) {
            if (array[i - 1] != array[i]) counter++;
        }
        System.out.println(counter);
    }
}