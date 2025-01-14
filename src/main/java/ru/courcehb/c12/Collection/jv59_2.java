package ru.courcehb.c12.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class jv59_2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i);
        }

        Iterator<Integer> integerPrintIterator = integerArrayList.iterator();
        while (integerPrintIterator.hasNext()) {
            System.out.println(integerPrintIterator.next());
        }

        Iterator<Integer> integerActIterator = integerArrayList.iterator();
        while (integerActIterator.hasNext()) {
            if (integerActIterator.next() % 2 == 0) {
                System.out.println(integerActIterator.next());
            } else integerActIterator.remove();
        }
    }
}