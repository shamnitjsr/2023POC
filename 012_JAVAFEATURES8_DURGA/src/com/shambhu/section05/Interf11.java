package com.shambhu.section05;

//just for utility purpose 
//anyone can call this method by interface name
public interface Interf11 {
	
	public static void m1() {
		System.out.println("interface static method");
	}

}

class Test11 implements Interf11{
	public static void main(String[] args) {
		
		Test11 t = new Test11();
		
		Interf11.m1();
	}
}
