package com.steve;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Dev obj = context.getBean("dev",Dev.class); // getting by name also works
        Dev obj = context.getBean(Dev.class); //Getting by type also works in this case
        obj.build();

        //Setting the private value from a setter
        //obj.setAge(20);
        //Getting the new age from the getter constructor
//        System.out.println(obj.getAge());

        //Laptop obj2 = context.getBean("laptop",Laptop.class);
        //obj2.compile();
    }
}
