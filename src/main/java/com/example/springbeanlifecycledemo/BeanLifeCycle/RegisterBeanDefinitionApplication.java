package com.example.springbeanlifecycledemo.BeanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterBeanDefinitionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(MyBean.class);

        context.scan("com.example.springbeanlifecycledemo.BeanLifeCycle");

        // 打印Bean定义
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println("beanDefinitionName = " + beanDefinitionName);
        }
    }
}
