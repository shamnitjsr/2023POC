package com.shambhu.set;

import java.util.HashSet;
import java.util.Iterator;

public class P02 {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student(100,"Smith"));
		hs.add(new Student(101,"John"));
		hs.add(new Student(102,"Kieth"));
		
		//System.out.println(hs);
		
		Iterator<Student> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
