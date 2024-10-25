package ru.courcehb.c4.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class JV11 {
    static int[] numbers = new int[3];

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(numbers);
        reverse(numbers);
    }

    public static void reverse(int[] input) {
        // handling null, empty and one element array
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(input));
    }
}