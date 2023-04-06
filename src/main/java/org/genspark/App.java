package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        /*
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Vehicle obj = (Vehicle) context.getBean("myCar");
        obj.drive();
        context.close();
         */

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung obj = (Samsung) context.getBean(Samsung.class);
        obj.config();

    }
}
