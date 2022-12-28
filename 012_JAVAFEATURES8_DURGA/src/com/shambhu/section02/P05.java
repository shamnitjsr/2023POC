package com.shambhu.section02;

interface Interf2{
	public void add(int a, int b);
}
public class P05 {

	public static void main(String[] args) {
		
		Interf2 i = (a,b)->System.out.println("The Sum:" +(a+b));
		
		i.add(90, 20);

	}

}
