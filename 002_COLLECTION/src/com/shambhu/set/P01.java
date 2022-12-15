package com.shambhu.set;

import java.util.HashSet;
import java.util.Iterator;

//Set
//======================
//Set is a interface available in java.util.package
//set interface extending from Collection interface
//Set is used to store group of objects
//Duplicate object not alllwoed
//supports Homogenious & hetrogenious data

//1.HashSet
//2.LinkedHashSet
//3.TreeSet

//insertion order not maintained
//initial capacity of HashSet is 16
//null value allowed

//1.Implementation class of Set interface
//2.Duplicate are not allwed
//3.Null is allowed
//4.Insertion order will not be maintain
//5.Intital capacity is 16
//6.Load Factor 0.75
//7.Internal Data Structure is HashTable
//8.we can create hashset with own intial capcity and load factor

//Constructors

//HashSet hs = new HashSet();

//HashSet hs = new HashSet(initial capacity);

//HashSet hs = new HashSet(int capacity, float loadFactor);

//Iterator cursor is called universal cursor

//ListIterator class is not used in HashSet

public class P01 {

	public static void main(String[] args) {

		HashSet<String> hs1 = new HashSet<>(100, 10.05f);
		
		HashSet<String> hs = new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one");
		hs.add(null);
		
		System.out.println(hs);
		
		hs.remove("three");
		System.out.println(hs);
		
		System.out.println("=======Interator class=======");
		
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
