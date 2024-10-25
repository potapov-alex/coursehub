package ru.courcehb.c4.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class JV12 {
    static int[] numbers = new int[3];

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}