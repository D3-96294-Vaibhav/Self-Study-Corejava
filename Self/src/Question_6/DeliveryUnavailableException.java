package Question_6;

public class DeliveryUnavailableException extends ShippingException {
	 public DeliveryUnavailableException() {
	        super("Delivery not available in this area");
	  }
}
