package com.shambhu.java8;

interface Interf1 {
	public void m1();
}

public class P04 {

	public static void main(String[] args) {
		Interf1 i = () -> System.out.println("Lambda Expression Implementation");
		i.m1();
	}
}
