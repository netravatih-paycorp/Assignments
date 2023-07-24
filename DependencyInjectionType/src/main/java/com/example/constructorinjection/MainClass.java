package com.example.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) 
	{
	 ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("com/example/constructorinjection/NewFile.xml");
	 Student std = (Student)c.getBean("s");
	 System.out.println(std);

	}

}
