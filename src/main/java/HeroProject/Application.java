package HeroProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
the springbootapplication annotation will conduct autoconfiguration
of spring MVC projects
and also conduct a scan within its package for components to register as beans
a bean, again, is an object managed by spring - this is called inversion of control
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
/*
Spring core - dependency injection, IOC, beans
Spring mvc - model/view/controller, web framework (http requests/responses, json mapping)
spring boot - autoconfiguration of spring project
spring orm - object relational mapping - maps java objects to their database representations
spring data/jpa - spring's database persistence api
 */