package com.github.mushkevych.genfabeto;

import org.springframework.test.util.ReflectionTestUtils;

public class FactoryMethod {

	public static BeanB createB(BeanC c) {
		BeanB b = new BeanB();
		ReflectionTestUtils.setField(b, "c", c);
		return b;
	}
	
}
