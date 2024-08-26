package com.oracle.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppConfigDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee obj = context.getBean(Employee.class);
		obj.setDepartment(context.getBean(Department.class));

		System.out.println(obj.toString());

		((AbstractApplicationContext) context).close();

		System.out.println("End");

	}

}
