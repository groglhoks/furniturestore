package ru.vershinin.furniture.store;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext cnt = SpringApplication.run(Application.class, args);

//        System.out.println("Let's inspect the beans provided by Spring Boot");
//
//        String[] beanNames = cnt.getBeanDefinitionNames();
//
//        for (String beanname: beanNames) {
//            System.out.println(beanname);
//        }
    }
}
