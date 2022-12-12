package com.shambhu.list;

import java.util.Stack;

// last-in-first-out
// peek() will give top element of stack
//Implementation class of List interface
//Extending from vector class
//Data Structure of Stack is LIFO (last i first out)

//push() --> to insert object
//peek() ---> to get last element
//pop() ----> to remove last element


//ArrayList--- Growable Array
//LinkedList----Duoble LinkedList
//Vector---- Growable Array
//Stack---- last-in-fast-out

//3 cursor avaialble 

//Iterator---forward direction
//ListIterator---forward abckward direction
//Enumeration --- forward direction & supports for legacy collection classes

//Collections framework introduced in 1.2 version
//before collections framework have legacy class is Vector

public class P004_Stack {

	public static void main(String[] args) {


		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(10);
		s.push(null);
		
		System.out.println(s);
		
		System.out.println(s.peek()); //will give top element of stack
		
		System.out.println(s.pop()); //will remove the top elemnt

	}

}
