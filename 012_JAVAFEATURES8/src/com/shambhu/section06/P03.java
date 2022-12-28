package com.shambhu.section06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class P03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		
		Predicate<Collection> p = a->a.isEmpty();
		
		System.out.println(p.test(al));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		System.out.println(p.test(al2));
		

	}

}
