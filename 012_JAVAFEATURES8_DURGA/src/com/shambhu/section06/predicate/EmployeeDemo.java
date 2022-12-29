package com.shambhu.section06.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Durga", "CEO", 30000.90, "Hyderabad"));
		list.add(new Employee("Mark", "Manager", 50000.90, "Bangalore"));
		list.add(new Employee("Rohan", "Scrum Master", 89000.78, "Newyork"));
		list.add(new Employee("satheesh", "manager", 67000.67, "Delhi"));
		list.add(new Employee("Niket", "Developer", 1908979009.09, "chennai"));
		
		/*
		 * System.out.println(list.stream().count());
		 * 
		 * for (Employee e : list) { System.out.println(e); }
		 */

		Predicate<Employee> p1 = emp -> emp.getDesignation().equalsIgnoreCase("Manager");
		display(p1, list);
		
		Predicate<Employee> p2 = emp -> emp.getCity().equalsIgnoreCase("Bangalore");

		display(p2, list);
		
		Predicate<Employee> p3 = emp -> emp.getSalary() < 50000;
		display(p3, list);
		
		System.out.println("=====================================================");
		
		display(p1.and(p2), list);
		
		System.out.println("=====================================================");
		
		display(p1.or(p3), list);
		
		System.out.println("=====================================================");
		
		display(p1.negate(), list);
		
		System.out.println("=====================================================");
		

	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
