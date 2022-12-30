package com.shambhu.ex2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test03 {

	public static void main(String[] args) {

		List<Integer> n = Arrays.asList(10, 23, -2, -3, -4, 7, 7, 0, 78, 54);

		System.out.println("============ squre of the number=====================");
		n.stream().map(x -> x * x).forEach(System.out::println);

		System.out.println("============print the the which is greater than > 2=====================");

		n.stream().filter(x -> x > 2).forEach(System.out::println);

		System.out.println("================print soretd list=================================");
		// print sorted list
		n.stream().sorted().forEach(System.out::println);

		System.out.println("==================print soretd list===============================");

		List<Integer> l = n.stream().sorted().collect(Collectors.toList());
		System.out.println(l);

		System.out.println("====================minimum from list=============================");
		int min = n.stream().min((x, y) -> x - y).get();
		System.out.println(min);

		System.out.println("====================minimum from list=============================");
		int max = n.stream().max((x, y) -> x - y).get();
		System.out.println(max);

		System.out.println("====================count the object from list=============================");
		Long count = n.stream().count();
		System.out.println(count);

		System.out.println("====================Even from list=============================");
		n.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

		System.out.println("====================Duplicate from list=============================");
		Set<Integer> hs = new HashSet<Integer>();
		n.stream().filter(x -> !hs.add(x)).forEach(System.out::println);

		System.out.println("====================reverse the list=============================");
		n.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

}
