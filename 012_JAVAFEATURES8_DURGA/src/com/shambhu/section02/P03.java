package com.shambhu.section02;

@FunctionalInterface
interface P {

	public void m1();

}

@FunctionalInterface
interface Q extends P {
	public void m1();
}
