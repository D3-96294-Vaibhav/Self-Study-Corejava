package Question_6;

public class Q6 {

	static void processOrder(int stock, double balance, String address) throws ECommerceException {

		if (stock <= 0)
			throw new OutOfStockException();

		if (balance < 1000)
			throw new InsufficientFundsException();

		if (address == null || address.isEmpty())
			throw new InvalidAddressException();

		System.out.println("Order processed successfully!");
	}

	public static void main(String[] args) {
		try {
			processOrder(0, 500, "");
		} catch (PaymentException e) {
			System.out.println("Payment Error: " + e.getMessage());
		} catch (InventoryException e) {
			System.out.println("Inventory Error: " + e.getMessage());
		} catch (ShippingException e) {
			System.out.println("Shipping Error: " + e.getMessage());
		} catch (ECommerceException e) {
			System.out.println("General Error: " + e.getMessage());
		}
	}
}
