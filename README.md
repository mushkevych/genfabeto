genfabeto
=========

Stands for Generalized Factory Bean Tool

A convenient tool to create and initialize a Spring bean with private (usually @Autowired) fields that have no public setters

So, for instance, when you have a love triangle like the one below, and you want to initialize beans explicitly:

    public class BeanA {
    	  private BeanB b;
        
        // we have a setter for this one
        public void setB(BeanB b) {
            this.b = b;
        }
    }
    
    public class BeanB {
        // but there is no public setter for field "c"
        @Autowired
        private BeanC c;
    }

    public class BeanC {
        String message;
        
        public void setMessage(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
    }

You can do it with the genfabeto like this:

    <bean id="a" class="BeanA">
        <property name="b" ref="b"/>
    </bean>
    
    <util:map id="beanArguments" value-type="java.lang.Object">
        <entry key="c" value-ref="c" />
    </util:map>
    <bean id="b" class="Ganfabeto" factory-method="createBean">
        <constructor-arg value="BeanB"/>
        <constructor-arg ref="beanArguments"/>
    </bean>
    
    <bean id="c" class="BeanC">
        <property name="bool" value="true"/>
        <property name="message" value="Unit Test Message"/>
    </bean>

Where bean **B** is initialized with a tiny bit of Ganfabeto magic.  
Cheers!
