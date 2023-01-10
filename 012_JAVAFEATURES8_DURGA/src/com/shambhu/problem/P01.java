package com.shambhu.problem;

import java.util.Random;
import java.util.Scanner;

//Print N Random numbers using java8 features
public class P01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number for random number::");
		int n = sc.nextInt();
		
		Random random = new Random();
		
		random.ints(1, 100).limit(n).forEach(System.out::println);
		

	}

}
