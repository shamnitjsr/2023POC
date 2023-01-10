package com.shambhu.problem;

import java.util.Arrays;
import java.util.List;

//count the number of String which have length > 5
public class P02 {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("welcome", "To", "Springboot", "microservices");

		long count = stringList.stream().filter(x->x.length()>5).count();
		System.out.println(count);
		
		stringList.stream().filter(x->x.length()>5).forEach(System.out::println);
	}

}
