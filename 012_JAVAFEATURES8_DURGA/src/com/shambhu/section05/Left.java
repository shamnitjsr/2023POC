package com.shambhu.section05;

interface Left {

	default void m1() {
		System.out.println("Left default method");
	}

}

interface Right {
	default void m1() {
		System.out.println("Right default method");
	}
}

class Test implements Left , Right{

	@Override
	public void m1() {
		System.out.println("My own implementation of default method");
		Left.super.m1();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

	
	
}