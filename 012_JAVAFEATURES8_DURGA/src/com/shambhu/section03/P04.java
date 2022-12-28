package com.shambhu.section03;

import java.util.TreeMap;

//TreeMap
//1.Sorting based on the Key only
//2.Duplicate key not allowed
public class P04 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);

		tm.put(100, "One");
		tm.put(200, "two");
		tm.put(400, "four");
		tm.put(300, "three");

		System.out.println(tm);

	}

}
