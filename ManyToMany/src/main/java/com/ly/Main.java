package com.ly;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) 
	{
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("one");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 Student s1 = new Student();
		 s1.setName("Anusha");
		 s1.setEmail("anusha@gmail.com");
		 s1.setPhno("9986488787");
		 
		 Student s2= new Student();
		 s2.setName("Guru");
		 s2.setEmail("guru@gmail.com");
		 s2.setPhno("6362002043");
		 
		 Student s3= new Student();
		 s3.setName("amit");
		 s3.setEmail("amit@gmail.com");
		 s3.setPhno("6362022043");
		 
		 Course c1  =  new Course();
		 c1.setCname("Java");
		 c1.setTrainer("faizan sir");
		 c1.setFees(15000);
		 
		 Course c2  =  new Course();
		 c2.setCname("Sql");
		 c2.setTrainer("shwetha mam");
		 c2.setFees(15000);
		 
		 Course c3  =  new Course();
		 c3.setCname("Html");
		 c3.setTrainer("lavanya sir");
		 c3.setFees(10000);
		 
		 
		 List<Student> list = new ArrayList<Student>();
		 list.add(s3);
		 list.add(s1);
		 
		 List<Student> list1 = new ArrayList<Student>();
		 list1.add(s3);
		 list1.add(s1);
		 list1.add(s2);
		 
		 List<Course> l = new ArrayList<Course>();
		 l.add(c1);
		 l.add(c2);
		 l.add(c3);
		 
		 List<Course> l1 = new ArrayList<Course>();
		 l1.add(c1);
		 l1.add(c2);
		 
		 s1.setCourses(l1);
		 s2.setCourses(l);
		 s3.setCourses(l);
		 
		 c1.setStudent(list1);
		 c2.setStudent(list);
		 c3.setStudent(list1);
		 
		 
		 
		 et.begin();
		 em.persist(s1);
		 em.persist(s2);
		 em.persist(s3);
		 em.persist(c1);
		 em.persist(c2);
		 em.persist(c3);
		 et.commit();
		 
		 
		 
		 
		 
		 
		
		 
		 
		 

	}

}
