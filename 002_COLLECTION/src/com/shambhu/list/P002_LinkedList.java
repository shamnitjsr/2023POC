package com.shambhu.list;

import java.util.LinkedList;

//LinkedList

//1.Implementation of List Interface
//2.Internal Data Structure is double linked list
//3.Insertion order preserved
//4.duplicates are allowed
//5.null objects allowed
//6. homogenious and hetrigenious data we can store
//7.LinkedList default capacity is not there
//8.LinkedList aplicable for insertion of data just because shifting is not there only change the link of node

//8.Double Linked List have previous & next node link
//9.Double Linked List have head node
//10.LinkedList do not know the index
//11.it is not applicable for retrival the data becuase its seraches from head node to specified indexes

public class P002_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(10);
		ll.add(null);
		
		System.out.println(ll);
		
		ll.add(1,15);
		System.out.println(ll);
		
		System.out.println(ll.getLast());
		System.out.println(ll.getFirst());

	}

}
