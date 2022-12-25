package com.shambhu.bari;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1 = new ArrayList<>(20);
		
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,90));
		
		al1.add(10);
		al1.add(0,5);
		al1.addAll(1,al2);
		al1.add(5, 70);
		
		al1.set(2, 100);
		
		System.out.println("=========ArrayList==========");
		for(int i=0;i<al1.size();i++) {
			System.out.print(al1.get(i) + " ");
		}
	
		System.out.println();
		System.out.println("============================");
		
		for(var al : al1) {
			System.out.print(al + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		Iterator it = al1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("============================");
		
		al1.forEach(x ->{
			System.out.print(x +" ");
		});
		
		System.out.println();
		System.out.println("============================");
		
		al1.forEach(System.out::print);
		System.out.println();
		
		System.out.println("=========LinkedList==========");

	}

}
