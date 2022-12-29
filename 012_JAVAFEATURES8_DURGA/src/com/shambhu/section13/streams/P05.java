package com.shambhu.section13.streams;

import java.util.ArrayList;

public class P05 {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("A");
		l.add("BB");
		l.add("CCC");
		
		l.stream().forEach(x->{
			System.out.println(x);
		});
		
		l.stream().forEach(System.out::println);

	}

}
