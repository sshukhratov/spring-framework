package com.cydeo.strereotype_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCourse.class);

        container.getBean(Java.class).getTeachingHours();
        container.getBean(Agile.class).getTeachingHours();
        container.getBean(Selenium.class).getTeachingHours();

    }
}
