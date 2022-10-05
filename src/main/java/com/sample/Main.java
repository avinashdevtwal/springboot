package com.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Emp emp = (Emp) context.getBean("e");
 		System.out.println("Student data>>" + emp);
	 
	
	/*ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext3.xml");
	Customer customer=(Customer) context.getBean("a");	
		System.out.println("Customer data>>" + customer);
*/
	
	}
}
