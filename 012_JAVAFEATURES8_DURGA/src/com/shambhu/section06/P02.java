package com.shambhu.section06;

import java.util.function.Predicate;

public class P02 {

	public static void main(String[] args) {
		
		Predicate<String> p = s -> s.length() > 5;
		
		System.out.println(p.test("Shambhu"));
		
		System.out.println(p.test("sham"));
		

	}

}
