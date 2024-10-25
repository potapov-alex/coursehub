package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preNumber = scanner.nextInt();
        int number = scanner.nextInt();
        int postNumber = scanner.nextInt();

        if (preNumber == 0 || number == 0) {
            System.out.println("No local max");
            System.exit(1);
        }
        int localMax = number;

        do {
            if (number > preNumber && number > postNumber) System.out.println(localMax);
            localMax = postNumber;
            preNumber = number;
            number = postNumber;
            postNumber = scanner.nextInt();
            if (postNumber == 0) {
                if (number > preNumber && number > postNumber)
                    System.out.println(localMax);
                break;
            }
        } while (number != 0);
    }
}