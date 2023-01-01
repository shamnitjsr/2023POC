package com.shambhu.student.ex4;

import java.util.ArrayList;
import java.util.function.Function;

//Predicate---test()--return boolean---to check conditional check
//Fucntion---apply()--take value return value
//Consumer---accept()--it accept the value no return type
//Spplier----get()----get---OTP--suppliy 6 digit ----radom password
//best use of supplier is ----random password ----get OTP 

//predicate -----get boolean value as response----test()
//Function----some input and output will get----apply()
//consumer----consume the the value we are not going to return anything--- accept();
//supplier----get value as ----OTC or Password---get()
public class Student {

	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) {

		ArrayList<Student> l = new ArrayList<Student>();
		
		l.add(new Student("Rohan", 34));
		l.add(new Student("Suman", 56));
		l.add(new Student("Raman", 89));
		l.add(new Student("Sumit", 76));
		
		System.out.println(l);

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distintion]";
			} else if (marks >= 60) {
				return "B[First Class]";
			}else if (marks >= 50) {
				return "C[Second Class]";
			}else if (marks >= 35) {
				return "D[Third Class]";
			}else {
				return "E[Failed]";
			}
		};
		
		
		

	}

}
