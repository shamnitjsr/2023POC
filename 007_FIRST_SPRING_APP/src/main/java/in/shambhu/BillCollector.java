package in.shambhu;

public class BillCollector {

	public IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public BillCollector() {

	}

	public BillCollector(IPayment payment) {

		this.payment = payment;
	}

	

	public void collectPayment(double amount) {

		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
