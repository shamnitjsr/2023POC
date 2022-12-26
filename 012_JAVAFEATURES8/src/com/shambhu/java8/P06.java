package com.shambhu.java8;

interface Interf06 {

	public int getLength(String s);
}

public class P06 {

	public static void main(String[] args) {

		Interf06 i = s -> s.length();
		
		System.out.println(i.getLength("Hello"));
	}

}
