package in.shambhu;

//In 2 ways car class can call Engine class method
//1.Inheritence 
//-----Car class is tightly coupled with Engine class
//-----Java doesnot support multiple inheritence
//it is not recommended to use inheritence object
//2.Composition

public class Car extends Engine{

	public void drive() {
		
		int status = super.start();
		
		if(status >=1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine Having Some problem...");
		}

	}

}
