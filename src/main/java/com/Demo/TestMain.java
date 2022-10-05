package com.Demo;


import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
 
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
 
	Drivers driver=(Drivers) context.getBean("c");
	 
	driver.con();
	}

}
