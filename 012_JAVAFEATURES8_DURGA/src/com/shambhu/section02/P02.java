package com.shambhu.section02;

//Functional Interface --If interface have only one Abstract method --Single Abstract Method(SAM)

//Runnable ---Contains only run() method
//Comaparable---contains only compareTo() method
//Callable---Contains only call() method
//ActionListener---Contains only actionperfored() method

//more than one Abstract method is not allowed in functional Interface 
//but we can take any number of default and static method

//@FunctionalInterface

@FunctionalInterface
interface Interf {
	
	public void m1();
	
	

	default void m2() {

	}

	public static void m3() {

	}
}

public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
