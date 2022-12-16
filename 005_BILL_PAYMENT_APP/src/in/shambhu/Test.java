package in.shambhu;

public class Test {

	public static void main(String[] args) {
		
		//BillCollector bc = new BillCollector();
		
		//injecting CreditCard obj into BillCollector (Setter Injection)
		//bc.setPayment(new CreditcardPayment());
		//bc.collectPayment(1200.89);
		
		
		//injecting CreditCard obj into BillCollector (Constructor Injection)
		//BillCollector bc1 = new BillCollector(new DebitcardPayment());
		//bc1.collectPayment(1500.09);
		
		
		CreditcardPayment ccd = new CreditcardPayment();
		BillCollector bc = new BillCollector();
		bc.payment = ccd;
		bc.collectPayment(2000.09);

	}

}
