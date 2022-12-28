package com.shambhu.ex2;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		int a[] = {12,23,32,13,34,12,34,23};
		
		Arrays.stream(a).distinct().forEach(
				x->{
					System.out.println(x);
				});

	}

}
