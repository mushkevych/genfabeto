package com.github.mushkevych.genfabeto;

/**
 * @author Doug Bateman
 * @author Bohdan Mushkevych
 * see LICENSE file for licensing details
 */
public class BeanA {

	private BeanB b;

	public void setB(BeanB b) {
		this.b = b;
	}

	public boolean returnBoolean() {
		return b.returnBoolean();
	}
	
	public String returnMessage() {
		return b.returnMessage();
	}

}
