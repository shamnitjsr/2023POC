package com.shambhu.section03;

import java.util.TreeSet;

//TreeSet
//1.TreeSet implementation class of Set interface
//2.Natural or default sorting order
//3.duplicate not allowed
//4.null not allowed

public class P03 {

	public static void main(String[] args) {


		//TreeSet<Integer> ts1 = new TreeSet<Integer>();
		TreeSet<Integer> ts1 = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		//(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;
		ts1.add(10);
		ts1.add(2);
		ts1.add(6);
		ts1.add(3);
		
		System.out.println(ts1);
		

	}

}
