package com.bootcamp.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Mahinda namal = context.getBean("namalHora",Namal.class);
        System.out.println(namal.steal());
        System.out.println(namal.planningLoan());

        Mahinda rohitha = context.getBean("rohithaHora",Rohitha.class);
        System.out.println(rohitha.steal());
        System.out.println(rohitha.planningLoan());

        Mahinda ranil = context.getBean("ranilHora",Ranil.class);
        System.out.println(ranil.planningLoan());

        context.close();


    }
}
// XML==>, Annotation, Class