package com.shambhu.section14.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//1.Lambda Expression
//2.Functional Interface-----Runnable---run()---Callable(call())---Comparable(CompareTo())
//ActionListerner----actionPerformed()
//3.default method inside interface
//4.static method inside interface
//5.predicate<T>
//6.function<T,R>
//7.supplier<T>
//8.consumer<R>
//9.stream
//10.date api -----JODA-TIME API
//11.forEach
//12.Method reference or constructor reference by using :: operator
//Date , Calender , Timestamp ......1.7v

//Java 1.8 version
//1.Lambda Expression
//2.Functional Interface
//3.Default method in interface
//4.Static method in interface
//5.Predicate Functional Interface
//6.Function Interface
//7.Consumer Functional Interface
//8.Suppier Functional Interface
//9.Stream Api
//10.Date Api
//11.forEach

public class P01 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.println(dd + "..." + mm +"...."+yyyy);
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
		
		System.out.printf("%d:%d:%d:%d", h,m,s,n);
		
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zone1 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt = ZonedDateTime.now(zone1);
		System.out.println(zt);

	}

}
