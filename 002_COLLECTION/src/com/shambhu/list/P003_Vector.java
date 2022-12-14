package com.shambhu.list;

import java.util.Enumeration;
import java.util.Vector;

//Vector

//1. it is implementation class of List Interface
//2. internal data Structure of Vector is growable array
//2. duplicated are allowed
//2. Insersion order preserved
//null value accepted
//vector is legacy class
//
//3. it is available from jdk 1.0 version
//4. it is legacy class
//5. it is thread safe
//6. its synchronized
//7.synchronized means single thread at same time
// Vector class have legacy enumeration iterator 
//We can not use enumeration with ArrayList class
//enumeration cursor is used with only vector class
//enumeration is used with only legacy claas vector

public class P003_Vector {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(100);
		v.add(200);
		v.add(300);
		
		Enumeration<Integer> elements = v.elements();
		while(elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		

	}

}
