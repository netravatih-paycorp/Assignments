package com.example.map;


import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/example/map/ConfiguralFile.xml");
	     Company e1=(Company)c1.getBean("b");
	     System.out.println(e1);
	     
	     Map<Integer,String> s1=e1.getEmpidandempname();
	     System.out.println(s1.getClass());

	}

}
