package com.shambhu.section06;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Durga", "CEO", 30000.90, "Hyderabad"));
		list.add(new Employee("Mark", "Manager", 50000.90, "Banaglore"));
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

	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
	}

}
