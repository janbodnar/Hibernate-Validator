package com.zetcode.bean;

import javax.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class User {
    
    @NotEmpty
    private String name;
    
    @NotEmpty
    @Pattern(regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}", 
            message="Please provide a valid email address")    
    private String email;
}

//http://springinpractice.com/2009/02/02/getting-started-with-hibernate-validator
//http://docs.oracle.com/javaee/6/tutorial/doc/gircz.html
//https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Web_Platform/5/html-single/Hibernate_Validator_Reference_Guide/index.html
//http://www.journaldev.com/3626/hibernate-validator-jsr303-example-tutorial
//http://stackoverflow.com/questions/4459474/hibernate-validator-email-accepts-askstackoverflow-as-valid
//https://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-validator-example/
//https://www.javacodegeeks.com/2013/04/spring-mvc-form-validation-with-annotations-2.html
//https://spring.io/guides/gs/validating-form-input/
//http://www.informit.com/articles/article.aspx?p=2425869
//https://docs.jboss.org/hibernate/validator/5.0/reference/en-US/html/chapter-bean-constraints.html
//http://developer.ucsd.edu/develop/data-layer/jpa/java-validation-api.html
//https://jersey.java.net/documentation/latest/bean-validation.html
//http://www.aviyehuda.com/blog/2010/04/14/using-hibernate-validator-to-cover-your-validation-needs/
