package ru.courcehb.c12.Collection;

import java.util.ArrayDeque;

public class jv56 {
    public static void main(String[] args) {
        // Создание PriorityQueue из 100 случайных чисел
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Moscow");
        deque.addLast("Athens");
        deque.addFirst("Belgrade");
        deque.addLast("Amsterdam");

        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());
        System.out.println(deque.size());
    }
}