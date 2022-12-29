package com.shambhu.section13.streams;

import java.util.stream.Stream;

public class P07 {

	public static void main(String[] args) {


		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Stream<Double> s1 = Stream.of(9.9,99.98,999.09,9999.34,99999.43);
		s1.forEach(System.out::println);
		
		Double[] d = {10.0,10.1,10.2};
		Stream<Double> s2 = Stream.of(d);
		s2.forEach(System.out::println);
	}

}

//Summary of Stream
//To process lements which of persent in Collection
//bulk operation in collection
//came 1.8 version of java
//Stream s = c.stream();
//filter the object based on the condition on Stream of zcollection
//filter(Predicate<T> t)
//map(Function<T,R> f)
//Collect()
//count()
//sorted()
//soreted(Comparator c)
//max(Comparator)---min(Comparator)
//forEach()
//toArray()
//Stream.of()