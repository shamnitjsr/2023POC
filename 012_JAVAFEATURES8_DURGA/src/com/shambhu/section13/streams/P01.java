package com.shambhu.section13.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//1.Lambda Expressions
//2.Functional Interfaces
//3.Default method
//4.static method
//5.Predicate 

//6.Function
//7.Consumer
//8.Supplier
//9.:: double colon operator ---method reference or constructor reference
//10.Java Streams
//1.8v Streams----Collections---certain operation
//java.io.Streams(purpose --read & write in file )
//if you want to process the objects from collection go with streams concept--bulk operation
public class P01 {

	public static void main(String[] args) {

		// 1.ArrayList is implementation class of List Inteface
		// 2.ArrayList preserved insersion order
		// 3.duplicate allowed
		// 4.null allowed
		// 5.internal data structure is growable array
		// 6.default size is 10
		// 7.after insersion of 10 element and inserting 11th element it will create new
		// array with size is 20 and copy the all element of 1st array to 2nd array.
		// 8. it recommended to use in case of retrival of the object because its works
		// by using of index of element
		// 9.its not recommended for insersion & deletetion of the object.

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);

		System.out.println(l);

		// print the all object of condition is even number
		l.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println("==============================================================");

		// odd element
		l.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
		System.out.println("==============================================================");

		List<Integer> l1 = l.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		for (Integer i : l1) {
			System.out.println(i);
		}
		System.out.println("==============================================================");

		List<Integer> l2 = l.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		
		for(Integer ii : l2) {
			System.out.println(ii);
		}
		System.out.println("==============================================================");
		
		//double of original element
		//l.stream().map(x->x*2).forEach(System.out::println);
		List<Integer>  ii1 = l.stream().map(x->x*2).collect(Collectors.toList());
		
		for(Integer iii : ii1) {
			System.out.println(iii);
		}

	}

}
