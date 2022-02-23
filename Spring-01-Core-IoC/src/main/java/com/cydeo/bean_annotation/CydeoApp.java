package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        PartTimeMentor pt = container.getBean("p1",PartTimeMentor.class);
        pt.createAccount();

        ConfigAny anyConfig = container.getBean(ConfigAny.class);
        System.out.println("anyConfig.str() = " + anyConfig.str());

        System.out.println("anyConfig.number() = " + anyConfig.number());



    }
}
