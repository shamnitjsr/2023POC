package com.shambhu.section06;

import java.util.function.Predicate;

public class P08 {

	public static void main(String[] args) {
		
		SoftwareEngineer[] list = {
				new SoftwareEngineer("Durga", 30, false),
				new SoftwareEngineer("Sunil", 10, true),
				new SoftwareEngineer("Snjeet", 20, false),
				new SoftwareEngineer("Sohan", 36, true),
				new SoftwareEngineer("Mark", 32, false),
				new SoftwareEngineer("Leigh", 22, true),
				
		};
		
		Predicate<SoftwareEngineer> allowed = x -> x.getAge() > 18 && x.isHavingGF()== true;
		
		for(SoftwareEngineer x : list )
		{
			if(allowed.test(x))
			{
				System.out.println(x);
			}
		}
		

	}

}
