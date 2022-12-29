package com.shambhu.section13.streams;

import java.util.ArrayList;

public class P06 {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(0);
		l.add(23);
		l.add(2);
		l.add(9);
		l.add(100);
		l.add(-2);
		
		System.out.println(l);
		
		Integer[] array = l.stream().toArray(Integer[] :: new);
		
		for(Integer x : array) {
			System.out.println(x);
		}

	}

}
