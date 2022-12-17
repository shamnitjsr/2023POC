package in.shambhu.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	
	private DieselEngine dieselEng;

	/*
	 * public void setDieselEngine(DieselEngine dieselEng) {
	 * 
	 * System.out.println("setDieselEngine() method executed.. "); this.dieselEng =
	 * dieselEng; }
	 */

	public Car() {
		System.out.println("Car :: 0-ParamConstructor");
	}
	
	public Car(DieselEngine dieselEng) {
		System.out.println("Car ::ParamConstructor");
		this.dieselEng = dieselEng;
	}
	
	public void drive() {
		int start = dieselEng.start();
		if(start >= 1) {
			System.out.println("Journey started....");
		}else {
			System.out.println("Engine Failed To Start....!!!!");
		}
	}

}
