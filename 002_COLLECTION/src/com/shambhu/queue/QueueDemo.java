package com.shambhu.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {


		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		
		System.out.println(queue);
		
		System.out.println(queue.element());
		
		System.out.println(queue.peek());
		
		Iterator<String> it = queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println(queue);
	}

}
