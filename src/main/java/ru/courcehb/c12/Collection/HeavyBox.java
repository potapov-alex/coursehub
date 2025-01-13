package ru.courcehb.c12.Collection;

import java.util.ArrayList;

public class HeavyBox {

    private String boxName;

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int heavyBoxQuantity;

    public int getHeavyBoxQuantity() {
        return heavyBoxQuantity;
    }

    public void setHeavyBoxQuantity(int heavyBoxQuantity) {
        this.heavyBoxQuantity = heavyBoxQuantity;
    }

    public HeavyBox(String setBoxName, int setWeight) {
        this.boxName = setBoxName;
        this.weight = setWeight;
    }

    @Override
    public String toString() {
        return "Box{" + "name = '" + boxName + '\'' + ", weight = " + weight + '}';
    }


    public static void main(String[] args) {
        //ok, пошли по пунктикам
        // 1. создать динамический массив, содержащий объекты класса HeavyBox
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();

        // 2. распечатать его содержимое, используя for each
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.toString()); // не затруднительно, но бесполезно ведь там никого нет
        }

        // 3. Изменить вес первого ящика на 1
        // а) логически невозможно, потому, что у нас нет ящиков.
        // б) нет указаний как изменять на (+/-) 1.
        //мы не сдаемся, для выполнения п.3 добавим объект класса HeavyBox
        heavyBoxes.add(0, new HeavyBox("box1", 2));
        // Создаем врем переменную для внесения изменений
        HeavyBox tempBox = heavyBoxes.get(0);
        // Вносим некоторые изменения
        tempBox.setWeight(tempBox.getWeight() + 1);
        // Возвращаем в ArrList
        heavyBoxes.set(0, tempBox);

        // 4. Удалить последний ящик (было бы невозможно если бы мы его не добавили,
        // пришлось бы писать условия или обрабатывать Exception)
        heavyBoxes.remove(heavyBoxes.size() - 1);

        // 5. Получить массив, содержащий ящики коллекции, тремя способами и вывести на консоль.
        //метод NumberOne
        System.out.println("на консоль через sout");
        System.out.println(heavyBoxes);
        //метод NumberTwo
        System.out.println("на консоль через for each");
        for (HeavyBox box : heavyBoxes) {
            System.out.println(box.toString()); // не затруднительно, но бесполезно ведь там никого нет
        }
        //метод NumberThree
        //а хз в голову ничего не лезет.
        // как и в консоль, ну а чего мы ожидали?

        //6. Удалить все ящики.
        heavyBoxes.clear();
    }
}