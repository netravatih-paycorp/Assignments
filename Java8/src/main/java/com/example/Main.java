package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main  
{

	public static void main(String[] args) 
	{
	
		
		Function<Integer,Integer> cal= (y) -> y*10;
		System.out.println("o/p --> "+cal.apply(3));
		
		InterfaceTwo add =(a,b) ->(a+b);
		System.out.println("output -->"+add.check(20, 30));
		
	
		SumFunctionalInterface sum = x -> x*10;
		System.out.println("o/p --> "+ sum.sum(4));
		
	
		Demo disp = b -> b.substring(4,8);
		System.out.println(disp.display("IAM JAVA DEV"));
		

		//method references java 8 with instance method
		Student s = new Student();
		//supplier will hold string object
		Supplier<String> op=s::getName;
		System.out.println(op.get());
		
		//method reference to create object
		Supplier<Student> obj = Student::new;
		System.err.println(obj.get());
		
		Supplier<String> ref= obj.get()::getName;
		System.out.println(ref.get());
		
		Supplier<List> list = ArrayList::new;
//		boolean a = list.get().add(10);
//		System.out.println(a);
//		
		
		
		
		System.out.println(list.get());
		
		//for static methods
		Supplier<String> sal = Student::getSalary;
		System.out.println(sal.get());
		
	}

	
}
