package com.github.mushkevych.genfabeto;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.test.util.ReflectionTestUtils;

public class BeanBFactoryBean implements FactoryBean<BeanB> {

	private BeanC c;
	
	public void setC(BeanC c) {
		this.c = c;
	}
	
	@Override
	public BeanB getObject() throws Exception {
		BeanB b = new BeanB();
		ReflectionTestUtils.setField(b, "c", c);
		return b;
	}

	@Override
	public Class<?> getObjectType() {
		return BeanB.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
}
