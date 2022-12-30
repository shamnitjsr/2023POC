package com.shambhu.section07.function;

import java.util.function.Function;

public class P02 {

	public static void main(String[] args) {
		
		String s = "Durga  Software  solutions  Hyderabad ";
		
		Function<String , String> f = x->x.replaceAll(" ", "");
		
		System.out.println(f.apply(s));
		
		Function<String , Integer> f1 = x->x.length() - x.replaceAll(" ", "").length();
		
		System.out.println(f1.apply(s));
		

	}

}
