package com.shambhu.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		
		e.add(new Employee(100 , "Suman" , 10000));
		
		e.add(new Employee(200 , "Rohan" , 20000));
		
		e.add(new Employee(300 , "Kieth" , 30000));
		
		e.add(new Employee(400 , "Mark" , 40000));
		
		e.add(new Employee(500 , "Leigh" , 50000));
		
		
		//count the number of employee
		long count = e.stream().count();
		System.out.println(count);
		
		System.out.println("========================================");
		
		//find the employee which eno > 300
		e.stream().filter(x->x.getEno() > 300).forEach(System.out::println);
		
		System.out.println("========================================");
		
		//employee name ----salary > 30000
		 e.stream().filter(x->x.getSalary()>30000).forEach(System.out::println);
		 
		 System.out.println("========================================");
		
		
		//count employee salary 
		 
		 long c = e.stream().count();
		 System.out.println(c);
		 
		 System.out.println("========================================");
		//list of employee salary > 8000
		 
		 e.stream().filter(x->x.getSalary()>40000).forEach(System.out::println);
		 System.out.println("========================================");
		//employee name high salary
		 
		 
		 Optional<Employee> max = e.stream().max(Comparator.comparing(Employee::getSalary)); 
		 System.out.println("========================================");
		
		

	}

}
