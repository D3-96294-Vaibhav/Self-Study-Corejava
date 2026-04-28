package Question_7;

import java.util.*;

class ShoppingCart {

    private Map<String, Product> cart = new HashMap<>();
    private List<Order> orderHistory = new ArrayList<>();
    
    public void addProduct(Product p) {
        if (cart.containsKey(p.id)) {
            Product existing = cart.get(p.id);
            existing.quantity += p.quantity;
        } else {
            cart.put(p.id, p);
        }
    }

    public void removeProduct(String id) {
        cart.remove(id);
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        cart.values().forEach(System.out::println);
    }
    
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        Order order = new Order(new ArrayList<>(cart.values()));
        orderHistory.add(order);

        System.out.println("Order placed successfully!");
        order.displayOrder();

        cart.clear();
    }

    public void viewOrderHistory() {
        if (orderHistory.isEmpty()) {
            System.out.println("No orders yet");
            return;
        }

        for (Order o : orderHistory) {
            o.displayOrder();
        }
    }
}