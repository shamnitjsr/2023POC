package in.shambhu;

public class Test {

	public static void main(String[] args) {
		
		//BillCollector bc = new BillCollector();
		
		//injecting CreditCard obj into BillCollector (Setter Injection)
		//bc.setPayment(new CreditcardPayment());
		
		
		//injecting CreditCard obj into BillCollector (Constructor Injection)
		BillCollector bc1 = new BillCollector(new CreditcardPayment());
		bc1.collectPayment(1500.09);

	}

}
