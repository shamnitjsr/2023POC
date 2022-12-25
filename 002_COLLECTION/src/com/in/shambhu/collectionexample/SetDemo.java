package com.in.shambhu.collectionexample;

import java.util.TreeSet;

//1.Set is a interface available in java.util.package
//2.Set interface extending from Collection interface
//3.Set is used to store group of objects
//4.Dublicate objects is not allowed
//5.Suppots Homogenious & Hetrogenious

//HashSet---implementation class of Set interface
//1.HashSet internally using HashMap
//2.initial capacity is 16 and load factor (0.75)
//3.insertion order not preserved
//4.null value allowed
//5.duplicate not allowed
//6.Internal DataStructute is HashTable
//7.hashCode for bucket number where record will stored

//LinkedHashSet
//1.LinkedHashSet internally using HashTable + doubly Linked List
//2.initial capacity is 16 and load factor (0.75)
//3.insertion order not preserved
//4.null value allowed
//5.duplicate not allowed
//6.Internal DataStructute is HashTable
//7.hashCode for bucket number where record will stored


//TreeSet
//1.Natural Sorted order
//2.duplicate not aloowed
//3.null value not allowed
//4.Homogenious data allowed
//5.Binary Tree internal data structure
//6.no capacity
//7.no load factor
//8.hetrogineous not allowed  

public class SetDemo {

	public static void main(String[] args) {
		
		/*
		 * HashSet<String> hs = new HashSet<>();
		 * 
		 * hs.add("one"); hs.add("two"); hs.add("three"); hs.add("four");
		 * hs.add("five"); hs.add(null); hs.add("one");
		 * 
		 * System.out.println(hs);
		 */
		
		TreeSet ts = new TreeSet<>();
		ts.add(12);
		ts.add(3);
		ts.add(0);
		ts.add(23);
		//ts.add(3);
		//ts.add(null);
		System.out.println(ts);
		
		

	}

}
