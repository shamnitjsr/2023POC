package in.shambhu;

public class DebitcardPayment implements IPayment{

	@Override
	public String pay(double amount) {
		
		return "payment successful through Debit Card";
	}

}
