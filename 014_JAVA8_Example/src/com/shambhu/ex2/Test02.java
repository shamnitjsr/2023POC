package com.shambhu.ex2;

import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		
		list.add("c");
		list.add("b");
		list.add(null);
		list.add("a");
		list.add("c");
		
		list.stream().distinct().filter(x->x!=null)
		.forEach((x)->{
					System.out.println(x);
				});
		
		list.stream().filter(x->x!=null).map(y->y.toUpperCase()).sorted().forEach(x->{
			System.out.println(x);
		});
		

	}

}
