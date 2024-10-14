package ru.courcehb.c4.introduction;

import java.util.Scanner;

public class JV5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number chessboard from 1 to 8 for second chess piece");
        int coordinate1l = new Scanner(System.in).nextInt();
        System.out.println("Enter number chessboard from 1 to 8 for first chess piece");
        int coordinate1c = new Scanner(System.in).nextInt();

        System.out.println("Enter number chessboard from 1 to 8 for second chess piece");
        int coordinate2l = new Scanner(System.in).nextInt();
        System.out.println("Enter number chessboard from 1 to 8 for second chess piece");
        int coordinate2c = new Scanner(System.in).nextInt();

        if (coordinate1c == coordinate2c || coordinate1l == coordinate2l)
            System.out.println("movement can be completed in one move");
        else System.out.println("movement can`t be completed in one move");
    }
}