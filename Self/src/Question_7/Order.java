package Question_7;

import java.util.*;

class Order {
    List<Product> products;
    double totalAmount;

    public Order(List<Product> products) {
        this.products = new ArrayList<>(products);
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getTotalPrice).sum();
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Total = " + totalAmount);
    }
}