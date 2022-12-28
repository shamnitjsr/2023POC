package com.shambhu.section04;

//Ananymous Inner class ---Nameless class is called Ananymous Inner class
//Without having class

/*
Runnable r = new Runnable() 
{
	public void run() {
		
	}
}

*/

class ThreadDemo1 {
	public static void main(String[] args) {
		Runnable r = new Runnable()
			{
				public void run() 
				{
					for(int i=0;i<10;i++) {
						System.out.print("Child Thread");
					}
				}
			};
			
			Thread t = new Thread(r);
			t.start();
			
			for(int i=0;i<10;i++) {
				System.out.print("Main Thread");
			}
		}
}
