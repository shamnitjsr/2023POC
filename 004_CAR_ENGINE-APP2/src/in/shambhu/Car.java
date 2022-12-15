package in.shambhu;

//In 2 ways car class can call Engine class method
//1.Inheritence 
//-----Car class is tightly coupled with Engine class
//-----Java doesnot support multiple inheritence
//it is not recommended to use inheritence object

//2.Composition
//By creating the object using new called composition
//object creating and calloing method is called composition
//clt+1+enter---for get the return type of method

//car and Engine class are tigtly coupled by suing inheritence and composition
//composition is creating the object and use the method
//Inheritence and composition is not recommended to use the interacting with 
//other class just because its raise the tightly coupling
//In both approches classes will become the tightly coupled
//IOC is creting the object and using the other class object without creting object
//by programmer.


public class Car {

	public void drive() {

		Engine eng = new Engine();
		int start = eng.start();

		if (start >= 1) {
			System.out.println("Journey Started...");
		} else {
			System.out.println("Engine Having Some problem...");
		}

	}

}
