package in.shambhu;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {

		return "payment successful through Upi";
	}

}
