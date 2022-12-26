package com.shambhu.section02;

interface Interf07 {
	
	public int squareIt(int x);

}

public class P07 {

	public static void main(String[] args) {

		Interf07 i = a -> a * a;

		System.out.println(i.squareIt(5));
	}
}
