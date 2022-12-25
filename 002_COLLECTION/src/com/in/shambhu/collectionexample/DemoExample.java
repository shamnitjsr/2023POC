package com.in.shambhu.collectionexample;
//ArrayList

import java.util.Stack;

public class DemoExample {

	public static void main(String[] args) {

		// ArrayList al = new ArrayList<>();
		// al.add(10);
		// al.add("SpringBoot");
		// al.add('S');
		// al.add(true);
		// al.add(34.87);
		// System.out.println(al);
		// System.out.println(al.size());
		// System.out.println(al.remove(2));
		// System.out.println(al);

		// vector is thread Safe.
		// ArrayList is not thread safe.
		// This is synchronized
		// Vector is legacy class.
		// Available from1.2 version
		// We can use enumeration with ArrayList
		// Enumeration is legacy cursor

		// Vector v = new Vector<>();
		// v.add(100);
		// v.add(200);
		// v.add(300);
		// v.add(400);
		// System.out.println(v);

		// Enumeration<Integer> elements = v.elements();
		// while(elements.hasMoreElements()) {
		// System.out.println(elements.nextElement());
		// }

		// Extending from Vector
		// internal Data Structure is LIFO

		Stack<String> s = new Stack();
		s.push("Suman");
		s.push("sumit");
		s.push("sanjay");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		//ArrayList-------Growable Array---`10
		//LinkedList----Double LinkedList
		//Vector----Groable Array---Thread Safe
		//Statch---LIFO
		//iterator()---forward direction (List & Set)
		//listItreator()---forward backward direction---List
		//Enumeration ----forward direction ---supports for legacy collection classes

	}

}
