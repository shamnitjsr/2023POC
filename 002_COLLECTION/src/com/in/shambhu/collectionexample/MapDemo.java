package com.in.shambhu.collectionexample;

import java.util.HashMap;

//1.HashMap ---Key-Value
//2.Key is unique
//3.value can we duplicate

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(100, "Rohan");
		hm.put(100, "Satheesh");
		hm.put(101, null);
		hm.put(null, "Naman");
		hm.put(null, "Naveen");
		
		System.out.println(hm);
		

	}

}
