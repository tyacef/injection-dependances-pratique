package fr.mrmint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Younes on 13/11/2016.
 */
public class Main {
    public static void main(String[] args) {

        //Instanciation du conteneur Spring IOC
        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/beans.xml");

        Injected bean1 = (Injected) context.getBean("injected1");
        System.out.println(bean1.sayHello());

        Injected bean2 = (Injected) context.getBean("injected2");
        System.out.println(bean2.sayHello());
    }
}
