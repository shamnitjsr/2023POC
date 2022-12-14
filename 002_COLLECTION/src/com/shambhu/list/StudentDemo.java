package com.shambhu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		
		//toString representation of Object without toString method
		
		ArrayList<Student> al = new ArrayList<>();
		
		//Scanner sc = new Scanner(System.in);
		//int id = sc.nextInt();
		//String name = sc.next();
		
		al.add(new Student(101 , "John"));
		al.add(new Student(102 , "Smith"));
		al.add(new Student(103 , "Kith"));
		al.add(new Student(104 , "Lissa"));
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		System.out.println("=====================================");
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("==============forEach=======================");
		al.forEach(i->{
			System.out.println(al.get(0));
		});
		
		System.out.println("=====================================");
		for(Student s : al) {
			System.out.println(s);
		}
		
		System.out.println("=============Reverse Order========================");
		for(int i = al.size() -1 ; i>=0 ;i--) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==========forward===========================");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("==========Backward===========================");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
