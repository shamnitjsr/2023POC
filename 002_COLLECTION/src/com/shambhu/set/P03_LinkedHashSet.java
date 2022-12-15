package com.shambhu.set;

import java.util.LinkedHashSet;
//Implementation class for Set interface
// LinkedHashSet maintain the insertion order
//dupliocate not allowed
//null value allowed
//internal datastructur is  Hash Table + doubly linked list
//available from 1.4 version of java

//initial capacity 16 and load factor 0.75

//HashSet will not maintain the insertion order 
//LinkedHashSet Manitain the insertion order
//HashSet will follow HashTable data Structure
//LinkedHashSet will follow HashTable + doubly LinkedList Data Structure 

public class P03_LinkedHashSet {

	public static void main(String[] args) {


		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("one");
		lhs.add(null);
		System.out.println(lhs);

	}

}
