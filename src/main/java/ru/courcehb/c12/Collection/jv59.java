package ru.courcehb.c12.Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class jv59 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>
                (Arrays.stream(Arrays.stream(new Scanner(System.in).nextLine().split(","))
                                .mapToInt(Integer::parseInt).toArray())
                        .boxed()
                        .collect(Collectors.toSet()));
        System.out.println(set);
    }
}