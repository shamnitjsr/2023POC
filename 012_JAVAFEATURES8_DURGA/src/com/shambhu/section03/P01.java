package com.shambhu.section03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Functional Interface ---Comparator (I) ----comapare() method
//To define our sorting--customize sorting

// public int compare(Object obj1, Object obj2)
// return -1  ----if obj1 has to come before obj2
// return  1  ----if obj1 has to come After obj2
// return 0  ----if obj1 are equal obj2

//Compartor Inteface is Functional Interface bacause it has single Abstract method
//Runnable ----run();
//Callable----call();
//ActionListener ----actionperformed();

class MyComarator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		/*
		 * if(o1 >o2) { return -1; }else if(o1 < o2){ return 1; }else { return 0; }
		 */
		
		return (01>02)?-1:(o1<o2)?1:0;
		
	}

}

class P01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(3);
		l.add(0);
		l.add(6);
		System.out.println(l);
		
		//Bydefault sorting order is Natural sorting order --Asecending order
		
		Collections.sort(l , new MyComarator());
		
		System.out.println(l);
		

	}

}
