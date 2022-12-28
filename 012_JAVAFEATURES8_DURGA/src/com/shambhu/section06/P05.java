package com.shambhu.section06;

import java.util.function.Predicate;

public class P05 {

	public static void main(String[] args) {


		String[] names = {"Sunnay","Kajal","Mallika","Katrina","Kareen"};
		
		Predicate<String> startsWithK = s->s.charAt(0)=='K';
		
		for(String s : names) {
			
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}

	}

}
