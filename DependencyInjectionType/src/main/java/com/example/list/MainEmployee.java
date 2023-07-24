package com.example.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee 
{
public static void main(String[] args) 
{
	ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("com/example/list/New.xml");
	System.out.println(c1.getBean("emp"));
	
}
}
