package com.example.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/example/setterinjection/configuration.xml");
	     Company c=(Company)c1.getBean("a");
	     System.out.println(c);
	     
	     System.out.println(c1.getBean("b"));


	}

}
