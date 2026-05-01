package com.example.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DependencyApplication.class, args);

        Dep dep = context.getBean(Dep.class);
        dep.hello();
    }
}
