package com.shambhu.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//ArrayList is implementation class of List interface
//Duplicate are allowed
//null allowed
//growable array
//insersion order preserved
//initial capacity 10

//1. ArrayList class is not recommended for insertion of specified index just because lots of shifting is happening
//its give poor performance

//2. ArrayList class is recommended for retrival operationof data

//3.internal data Structure is growable array

//4.duplicate are allowed

//5.homogenious and hetrigenious data supported



public class P001_ArrayList {

	public static void main(String[] args) {

		
		ArrayList al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add("John");
		al.add(false);
		al.add('H');
		al.add(25.5);
		al.add(2900000l);
		al.add(null);

		// Approach-1
		System.out.println(al);

		// Approach-2
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		// Approach-3
		for (Object all : al) {
			System.out.print(all + " ");
		}

		// Approach-4
		System.out.println();
		System.out.println("====For Iterator Approach");

		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// Approach-5
		System.out.println();
		System.out.println("====For ListIterator Approach");
		
		ListIterator listIterator = al.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		
		// Approach-6
		
		System.out.println();
		System.out.println("====For forEach Approach");
		
		al.forEach(i ->{
			System.out.print(i);
		});
		
		

	}

}
