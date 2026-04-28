package Question_6;

public class InsufficientFundsException extends PaymentException{
	public InsufficientFundsException() {
        super("Insufficient funds for payment");
    }
}
