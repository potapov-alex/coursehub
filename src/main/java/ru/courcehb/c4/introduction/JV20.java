package ru.courcehb.c4.introduction;

public class JV20 {

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int thousands = i / 1000;
            int hundreds = (i - (thousands * 1000)) / 100;
            int tens = (i - (thousands * 1000) - (hundreds * 100)) / 10;
            int units = i % 10;
            if (thousands * hundreds * tens * units == thousands + hundreds + tens + units) System.out.println(i);
        }
    }
}