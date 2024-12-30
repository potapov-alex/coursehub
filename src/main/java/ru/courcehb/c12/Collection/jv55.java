package ru.courcehb.c12.Collection;

import java.util.PriorityQueue;
import java.util.Random;


public class jv55 {
    public static void main(String[] args) {
        // Создание PriorityQueue из 100 случайных чисел
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            queue.offer(random.nextInt(100));
        }

        // Вывод очереди на экран
        System.out.println("Очередь:");
        for (int num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Нахождение длины очереди
        int length = queue.size();
        System.out.println("Длина очереди: " + length);

        // Нахождение среднего значения всех чисел
        double sum = 0;
        for (int num : queue) {
            sum += num;
        }
        double average = sum / length;
        System.out.println("Среднее значение: " + average);
    }
}