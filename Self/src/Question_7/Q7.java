package Question_7;

import java.util.Scanner;

public class Q7 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int menu() {
		  System.out.println("0.Exit");
		  System.out.println("1.Add Product");
          System.out.println("2.Remove Product");
          System.out.println("3.View Cart");
          System.out.println("4.Checkout");
          System.out.println("5.Order History");
          int choice = sc.nextInt();
          return choice;
	}
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		int choice;
		while((choice=menu()) != 0) {
			switch (choice) {
			case 1:
			{
				System.out.println("Add the products");
				System.out.println("Enter the Product id: ");
				String id = sc.next();
				System.out.println("Enter the Product name: ");
				String name = sc.next();
				System.out.println("Enter the Product price: ");
				double price= sc.nextDouble();
				System.out.println("Enter the Product quantity: ");
				int qty= sc.nextInt();
				cart.addProduct(new Product(id, name, price, qty));
				break;
			}
			case 2:
			{
				System.out.print("Enter product id: ");
				String id = sc.next();
                cart.removeProduct(id);
				break;
			}
			case 3:
			{
				cart.viewCart();
				break;
			}
			case 4:
			{
				cart.checkout();
				break;
			}
			case 5:
			{
				cart.viewOrderHistory();
				break;
			}
			}
		}
	}
}
