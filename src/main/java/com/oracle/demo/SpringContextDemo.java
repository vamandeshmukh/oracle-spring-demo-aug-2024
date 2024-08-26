package com.oracle.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

@ComponentScan
public class SpringContextDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		// without spring
//		Employee obj = new Employee();
//		System.out.println(obj.toString());
//		Employee obj2 = new Employee();
//		System.out.println(obj2.toString());
//		System.out.println(obj.equals(obj2));
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());

		// with spring

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextDemo.class);

		Employee obj = context.getBean(Employee.class);
		System.out.println(obj.toString());

		Employee obj2 = context.getBean(Employee.class);
		System.out.println(obj2.toString());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		((AbstractApplicationContext) context).close();

	}

}
