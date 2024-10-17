package ru.courcehb.c4.introduction;


import java.util.Arrays;
import java.util.Scanner;
;import static java.lang.Math.*;

public class JV7 {
    static int[] numbers = new int[3];


    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Scanner(System.in).nextInt();
        }

        Arrays.sort(numbers);

        if (pow(numbers[0], 2) + pow(numbers[1], 2) == pow(numbers[2], 2)) System.out.println("True");
        else System.out.println("False");
            }
}