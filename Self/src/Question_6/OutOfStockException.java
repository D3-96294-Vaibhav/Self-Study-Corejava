package Question_6;

public class OutOfStockException extends InventoryException {
	public OutOfStockException() {
        super("Product is out of stock");
    }
}
