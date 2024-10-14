package ru.courcehb.c4.introduction;

import java.util.Random;
import java.util.Scanner;

public class JV21 {
    public static void main(String[] args) {
        int interval = new Scanner(System.in).nextInt();
        int quantity = new Scanner(System.in).nextInt();

        Random random = new Random();

        for (int i = 0; i < quantity; i++) {
            int randomNumber = random.nextInt(2 * interval + 1) - interval;
            System.out.print(randomNumber+" ");
        }
    }
}