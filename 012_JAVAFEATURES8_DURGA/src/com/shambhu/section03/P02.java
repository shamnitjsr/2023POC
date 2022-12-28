package com.shambhu.section03;

import java.util.ArrayList;
import java.util.Collections;

public class P02 {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(3);
		l.add(0);
		l.add(6);
		System.out.println(l);
		Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		System.out.println(l);

	}

}
