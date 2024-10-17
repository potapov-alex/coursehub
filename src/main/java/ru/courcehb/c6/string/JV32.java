package ru.courcehb.c6.string;

import java.util.Scanner;

public class JV32 {
    static String string;
    static char letter;
    static int counter;

    public static void main(String[] args) {
        string = new Scanner(System.in).nextLine();
        letter = new Scanner(System.in).nextLine().charAt(0);
        char[] stringArr = string.toCharArray();
        for (int i = 0; i < stringArr.length; i++) {
            if (letter == stringArr[i]) counter++;
        }
    }
}