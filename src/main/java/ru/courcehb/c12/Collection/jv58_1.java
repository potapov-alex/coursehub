package ru.courcehb.c12.Collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class jv58_1 {

    static int heavyBoxQuantity;
    public static ArrayList<heavyBox> boxes = new ArrayList<>();

    public static class heavyBox {
        String boxName;
        int weight;

        public heavyBox(String boxName, int weight) {
            this.boxName = boxName;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "heavyBox{" + "boxName='" + boxName + '\'' + ", weight=" + weight + '}';
        }
    }

    public static heavyBox createHeavyBox() {
        return new heavyBox("heavyBox" + new Random(), new Random().nextInt(10)+1);
    }

    public static void heavyBoxesAdd(ArrayList boxes) {
        heavyBoxQuantity = new Scanner(System.in).nextInt();

        for (int i = 0; i < heavyBoxQuantity; i++) {
            boxes.add(createHeavyBox());
        }
    }

    public static void heavyBoxToString(ArrayList<heavyBox> boxes) {
        boxes.forEach((box) -> box.toString());
    }


    public static void main(String[] args) {
        heavyBoxesAdd(boxes);

        for (int i = 0; i < heavyBoxQuantity; i++) {
            System.out.println(boxes.get(i));
        }

        heavyBoxToString(boxes);

    }

}
