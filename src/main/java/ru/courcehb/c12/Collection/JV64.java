package ru.courcehb.c12.Collection;

import java.util.Arrays;

public class JV64 {
    public static void main(String[] args) {
        int[] list = new int[]{1, 0, 2, 9, 3, 7, 4, 5, 6};
        Arrays.sort(list);
        Arrays.toString(list);
        Arrays.copyOfRange(list, 0, 5);
        Arrays.equals(list, list);
    }
}