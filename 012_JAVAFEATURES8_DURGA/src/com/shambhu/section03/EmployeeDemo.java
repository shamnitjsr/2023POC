package com.shambhu.section03;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();

		l.add(new Employee(100, "John"));
		l.add(new Employee(200, "Smith"));
		l.add(new Employee(300, "Kith"));
		l.add(new Employee(400, "Mark"));

		System.out.println(l);
		
		Collections.sort(l , (e1, e2) -> (e1.empId < e2.empId) ? -1 : (e1.empId > e2.empId) ? 1 : 0);

		System.out.println(l);
	}

}
