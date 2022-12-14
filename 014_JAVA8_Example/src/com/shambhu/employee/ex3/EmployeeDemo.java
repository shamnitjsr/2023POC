package com.shambhu.employee.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {

		ArrayList<Employee> e = new ArrayList<Employee>();

		e.add(new Employee(100, "Suman", 10000, "HYD"));

		e.add(new Employee(200, "Rohan", 20000, "DEL"));

		e.add(new Employee(300, "Kieth", 30000, "BLR"));

		e.add(new Employee(400, "Mark", 40000, "PAT"));

		e.add(new Employee(500, "Leigh", 50000, "DEL"));

		// count the number of employee
		long count = e.stream().count();
		System.out.println(count);

		System.out.println("========================================");

		// find the employee which eno > 300
		e.stream().filter(x -> x.getEno() > 300).forEach(System.out::println);

		System.out.println("========================================");

		// employee name ----salary > 30000
		e.stream().filter(x -> x.getSalary() > 30000).forEach(System.out::println);

		System.out.println("========================================");

		// count employee salary

		long c = e.stream().count();
		System.out.println(c);

		System.out.println("========================================");
		// list of employee salary > 8000

		e.stream().filter(x -> x.getSalary() > 40000).forEach(System.out::println);

		System.out.println("==============employee name high salary==========================");
		Optional<Employee> max = e.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(max);

		System.out.println("==============GroupByCityName==========================");
		Map<String, List<Employee>> groupBy = e.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println(groupBy);

		System.out.println("==============DesendingOrderBasedOnTheSlaryOfEmployee===============");
		List<Employee> emp = e.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(emp);

		System.out.println("==============Top 3 employee who has highest salary===============");
		List<Employee> emp1 = e.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(3)
				.collect(Collectors.toList());
		System.out.println(emp1);
		
		System.out.println("==============Fetch all employee having salary less than  3rd highest salary===============");
		List<Employee> emp2 = e.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3)
				.collect(Collectors.toList());
		System.out.println(emp2);

	}

}
