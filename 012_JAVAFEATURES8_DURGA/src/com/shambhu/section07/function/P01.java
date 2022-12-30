package com.shambhu.section07.function;

import java.util.function.Function;

//Predicate ---return boolean value--test()
//Function -- apply()----return any type--Average salary of all employee
//consumer -- 
//supplier --- get()
public class P01 {

	public static void main(String[] args) {
		
		Function<String , Integer> f = s -> s.length();
		System.out.println(f.apply("Durgasoft"));
		
		Function<Integer , Integer> f1 = i->i*i;
		System.out.println(f1.apply(9));

	}

}
