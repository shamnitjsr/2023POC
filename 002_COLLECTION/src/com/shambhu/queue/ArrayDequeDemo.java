package com.shambhu.queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<String> ad =new ArrayDeque<>();
		
		ad.add("one");
		ad.add("two");
		ad.add("three");
		ad.add("four");
		ad.addFirst("Ashok");
		ad.addLast("Shambhu");
		
		System.out.println(ad);
		
		ad.pollFirst();
		System.out.println(ad);
		ad.pollLast();
		
		System.out.println(ad);

	}

}
