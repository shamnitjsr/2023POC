package in.shambhu;

public class BillCollector {

	public IPayment payment;

	public void setPayment(IPayment payment) {
		System.out.println("setPayment() ::: executed");
		this.payment = payment;
	}

	

	public BillCollector(IPayment payment) {

		System.out.println("BillCollector :: Param Constructor Executed");
		this.payment = payment;
	}

	

	public void collectPayment(double amount) {

		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
