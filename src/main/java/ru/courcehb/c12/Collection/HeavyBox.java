package ru.courcehb.c12.Collection;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class HeavyBox {

    private String boxName;
    private int weight;

    private int heavyBoxQuantity;
    private ArrayList<HeavyBox> heavyBoxes;

    public HeavyBox(String setBoxName, int setWeight) {
        this.boxName = setBoxName;
        this.weight = setWeight;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeavyBoxQuantity() {
        return heavyBoxQuantity;
    }

    public void setHeavyBoxQuantity(int heavyBoxQuantity) {
        this.heavyBoxQuantity = heavyBoxQuantity;
    }

    public void HeavyBoxList() {
        this.heavyBoxes = new ArrayList<>();
    }

    public void addHeavyBox(HeavyBox heavyBox) {
        this.heavyBoxes.add(new HeavyBox(setBoxName(UUID.randomUUID().toString()), setWeight(new Random().nextInt() * 100));
    }

    @Override
    public String toString() {
        return "Box{" +
                "name = '" + boxName + '\'' +
                ", weight = " + weight +
                '}';
    }


    public static void main(String[] args) {


    }

}
