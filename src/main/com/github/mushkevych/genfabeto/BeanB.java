package com.github.mushkevych.genfabeto;

import org.springframework.beans.factory.annotation.Autowired;

/* Someone else wrote this, and I can't change it. */
public class BeanB {

	@Autowired
	private BeanC c;

	public void doMore() {
		c.greet();
	}
	/*I don't have a public setter for c*/
	
}
