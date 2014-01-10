package com.github.mushkevych.genfabeto;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Bohdan Mushkevych
 * see LICENSE file for licensing details
 */
public class GenfabetoTest {
    public static final String EXPECTED_MESSAGE = "Unit Test Message";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testBeanCreation() throws Exception {
        ApplicationContext spring = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanA a = spring.getBean("a", BeanA.class);
        assertTrue(a.returnBoolean());
        assertEquals(a.returnMessage(), EXPECTED_MESSAGE);
    }
}
