package com.in.shambhu.collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//toString representation of object without toString()

public class StudentMain {

	public static void main(String[] args) {


		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(1,"Raman"));
		al.add(new Student(2,"Satheesh"));
		al.add(new Student(3,"Suman"));
		al.add(new Student(4,"John"));
		
		for(Student s : al) {
			System.out.println(s);
		}
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator lit = al.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		for(int i = al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
		

	}

}
