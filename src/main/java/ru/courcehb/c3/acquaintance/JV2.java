package ru.courcehb.c3.acquaintance;

import java.util.Scanner;

public class JV2 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int nextOdd = ++number;
        while (nextOdd % 2 == 0) {
            nextOdd++;
        }
        System.out.println(nextOdd);
    }
}