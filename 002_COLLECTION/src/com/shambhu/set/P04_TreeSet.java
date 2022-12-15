package com.shambhu.set;

import java.util.TreeSet;

//natural Sorting order
//binary tree
//null not allowed---NullPointerException
//homogenious data

//ClassCastException


//1.Implementation class for Set interface
//2.It will maintainn Natural Sorting Order
//3.Duplicates are not allowed 
//4.Null value not allowed

//5.Supports oly homogenious data
//6.Hetrogenious data not allowed

//Note1 : When we add null value it will try to compare null value with previous object then we will get
//NullPointerException.

//Note 1: RTreeSet should perform sorting so always it will comapare new added object with old object.
//In Order to compare objects should be same type.otherwise will get ClassCastException
//Internal data structure is BinaryTree

public class P04_TreeSet {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		/*
		 * ts.add(13); ts.add(23); ts.add(0);
		 * 
		 * 
		 * ts.add(2);
		 */

		ts.add("hi");
		ts.add("raja");
		ts.add("ganesh");
		ts.add("hi");

		// ts.add(10);

		System.out.println(ts);

	}

}
