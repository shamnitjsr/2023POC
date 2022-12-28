package com.shambhu.section06;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String username;
	String pwd;

	public User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}
}

public class P07 {

	public static void main(String[] args) {
		
		Predicate<User> p = u -> u.username.equals("durga") && u.pwd.equals("java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName:");
		String username = sc.next();
		
		System.out.println("Enter Password:");
		String pwd = sc.next();
		
		User user = new User(username,pwd);
		
		if(p.test(user)) {
			System.out.println("Valid user and can available allservice");
		}else {
			System.out.println("Invalid user you cannot available services");
		}

	}

}
