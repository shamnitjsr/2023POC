package com.shambhu.section13.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(23);
		al.add(3);
		al.add(2);
		
		List<Integer> i = al.stream().sorted().collect(Collectors.toList());
		System.out.println(i);
		System.out.println("=====================================================");
		List<Integer> ll = al.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println(ll);
	}

}
