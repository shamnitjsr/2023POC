package com.shambhu.section06.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class P06 {

	public static void main(String[] args) {


		String[] names = {"durga","","Ravi",null,"","shiva",null};
		
		Predicate<String> p = s->s != null && s.length() != 0; 
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(String s : names) {
			if(p.test(s)) {
				al.add(s);
			}
		}
		System.out.println("The list of Valid String is :::" +al);

	}

}
