package com.rahul.project1;

import com.rahul.collections.Emp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
		//System.out.println("Rahul");
		// TODO: How to get normal data
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Student student1 = (Student) context.getBean("student1");
//		Student student2 = (Student) context.getBean("student2");

		/* creating the beans in the config.xml file*/
//		System.out.println(student2);

		// TODO: How to get data from map,list,set

		ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
		Emp emp1 = (Emp) context.getBean("Emp");

		System.out.println(emp1.getAddress());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getName());
		System.out.println(emp1.getCourses());


	}
}
