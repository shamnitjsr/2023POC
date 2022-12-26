package com.shambhu.java8;

//By Default java provide Functional Interface ---Only one abstract method
//Runnable() -- run()
//Callable() -- call()
//Comparable -- campareTo()
//ActionListener---Contains only actionperfored() method

class MyRunnable implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class P08 {
	
	public static void main(String[] args) {
		
		Runnable r1= new MyRunnable();
		Thread t = new Thread(r1);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}

}
