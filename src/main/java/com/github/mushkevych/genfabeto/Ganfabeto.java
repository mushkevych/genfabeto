package com.github.mushkevych.genfabeto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Map;

/**
 * @author Bohdan Mushkevych
 * see LICENSE file for licensing details
 */
public class Ganfabeto {
    private static final Logger log = LogManager.getLogger(Ganfabeto.class);

    public static Object createObject(String className) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        Class classDefinition = Class.forName(className);
        return classDefinition.newInstance();
    }

    public static Object createBean(String className, Map<String, Object> params) {
        try {
            Object bean = createObject(className);
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                ReflectionTestUtils.setField(bean, entry.getKey(), entry.getValue());
            }
            return bean;
        } catch (ClassNotFoundException e) {
            String eMessage = String.format("Unable to find a class %s", className);
            log.error(eMessage, e);
            throw new BeanCreationException(eMessage, e);
        } catch (IllegalAccessException e) {
            String eMessage = String.format("Unable to access a class %s", className);
            log.error(eMessage, e);
            throw new BeanCreationException(eMessage, e);
        } catch (InstantiationException e) {
            String eMessage = String.format("Unable to instantiate a class %s", className);
            log.error(eMessage, e);
            throw new BeanCreationException(eMessage, e);
        }
    }
}
