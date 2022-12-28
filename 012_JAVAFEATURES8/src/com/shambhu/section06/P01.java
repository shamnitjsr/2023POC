package com.shambhu.section06;

import java.util.function.Predicate;

//1.Lambda Expression
//2.Functional Interface---Runnable(run())--Comparable(compareTo())
//--Callable(call())---ActionListener(actionPerformed())
//3.Default Method
//4.static method
//java.util.function
//5.Predicate----return---true/false
//----test()
//6.Function
//7.Consumer
//8.Supplier

/*
interface Predicate<T>
{
	boolean test(T t);
}
*/



public class P01 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = I -> I > 10;
		
		System.out.println(p.test(100));
		System.out.println(p.test(8));

	}

}
