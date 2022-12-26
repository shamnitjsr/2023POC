package com.shambhu.java8;

@FunctionalInterface
interface P {

	public void m1();

}

@FunctionalInterface
interface Q extends P {
	public void m1();
}
