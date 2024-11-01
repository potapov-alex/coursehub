package ru.courcehb.c8.oop.jv41;

public class Order {
    double weight;
    String name;
    String address;

    public Order(double weight, String name, String address) {
        this.weight = weight;
        this.name = name;
        this.address = address;
    }

    public static boolean isBelong(String name, String address) {
        Customer customer = new Customer("alex", "myAddress");
        Order order = new Order(3.7, "alex", "myAddress");
        return (customer.name.equals(order.name) && customer.address.equals(order.address));
    }
}
