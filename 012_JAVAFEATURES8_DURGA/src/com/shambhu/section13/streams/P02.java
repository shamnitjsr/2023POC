package com.shambhu.section13.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P02 {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Pavan");
		l.add("RaviTeja");
		l.add("chiranjeevi");
		l.add("Venkatasewsdddds");
		l.add("Nagarjuna");
		l.add("Rohan");
		
		System.out.println(l);
		System.out.println("=======================================================");
		//print the name length is greater than 9
		l.stream().filter(x->x.length()>9).forEach(System.out::println);
		System.out.println("=======================================================");
		List<String> str1 = l.stream().filter(x->x.length()>9).collect(Collectors.toList());
		System.out.println(str1);
		System.out.println("=======================================================");
		//Uppercase
		List<String> str2 = l.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(str2);
		System.out.println("=======================================================");
		//lowercase
		List<String> str3 = l.stream().map(x->x.toLowerCase()).collect(Collectors.toList());
		System.out.println(str3);
		System.out.println("=======================================================");
		//count the number object
		
		Long ld = l.stream().filter(x->x.length()>9).count();
		System.out.println(ld);
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		

	}

}
