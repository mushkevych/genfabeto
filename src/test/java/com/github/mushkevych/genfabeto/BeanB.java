package com.github.mushkevych.genfabeto;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Doug Bateman
 * @author Bohdan Mushkevych
 * see LICENSE file for licensing details
 *
 * Test case assumption: this bean was written by third-party and we can not change it
 */
public class BeanB {

    /**
     * Test case assumption: there is no public setter for field "c"
     */
    @Autowired
	private BeanC c;

	public Boolean returnBoolean() {
		return c.getBool();
	}

	public String returnMessage() {
		return c.getMessage();
	}

}
