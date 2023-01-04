package com.shambhu.student.ex4;


/*Runnable r = new Runnable();
		   =Lambda Expression
		   =method reference:*/

// Thread t = new Thread();
public class MT1 {

	
	public static void main(String[] args) {
		
		Runnable r = () ->{
			for(int i= 0;i<10;i++) {
				System.out.println("Child Threaad");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i= 0;i<10;i++) {
			System.out.println("Main Threaad");
		}
	}

	
}

