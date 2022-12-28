package com.shambhu.section05;

public interface Interf10 {
	
	default void m1() {
		System.out.println("default method");
	}

}

class Test2 implements Interf10{
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}

class Test1 implements Interf10{
	
	public void m1() {
		System.out.println("my own implementation");
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.m1();
	}
}
