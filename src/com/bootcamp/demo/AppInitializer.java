package com.bootcamp.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Mahinda namal = context.getBean("namalHora",Namal.class);
        System.out.println(namal.steal());

        Mahinda rohitha = context.getBean("rohithaHora",Rohitha.class);
        System.out.println(rohitha.steal());
        context.close();

       /* Mahinda namal = new Namal();
        System.out.println(namal.steal());
        Mahinda rohitha = new Rohitha();
        System.out.println(rohitha.steal());*/
    }
}
// XML==>, Annotation, Class