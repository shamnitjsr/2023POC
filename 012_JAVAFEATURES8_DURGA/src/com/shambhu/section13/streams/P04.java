package com.shambhu.section13.streams;

import java.util.ArrayList;

public class P04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(0);
		l.add(23);
		l.add(2);
		l.add(9);
		l.add(100);
		l.add(-2);
		
		int max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		int min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		l.stream().forEach(System.out::println);

	}

}
