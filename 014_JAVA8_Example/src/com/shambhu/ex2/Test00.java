package com.shambhu.ex2;

import java.util.Arrays;

public class Test00 {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,50};
		
		long count = Arrays.stream(a).count();
		System.out.println(count);
	}

}
