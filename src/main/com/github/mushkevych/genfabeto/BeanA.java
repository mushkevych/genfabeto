package com.github.mushkevych.genfabeto;

/* I write this bean */
public class BeanA {

	private BeanB b;

	public void setB(BeanB b) {
		this.b = b;
	}

	public void doSomething() {
		b.doMore();
	}
	
}
