package com.github.mushkevych.genfabeto;

/**
 * @author Doug Bateman
 * @author Bohdan Mushkevych
 * see LICENSE file for licensing details
 */
public class BeanC {

	String message;
    Boolean bool;
	
	public void setMessage(String message) {
		this.message = message;
	}

    public String getMessage() {
        return message;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public Boolean getBool() {
        return bool;
    }
}
