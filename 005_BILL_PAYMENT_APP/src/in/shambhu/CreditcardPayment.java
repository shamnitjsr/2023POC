package in.shambhu;

public class CreditcardPayment implements IPayment {

	@Override
	public String pay(double amount) {

		return "Payment successful through Credit Card";
	}

}
