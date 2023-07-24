package com.ly;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ly/new.xml");

		et.begin();
		em.persist(context.getBean("s1"));
		em.persist(context.getBean("s2"));
		em.persist(context.getBean("s3"));
		em.persist(context.getBean("c1"));
		em.persist(context.getBean("c2"));
		em.persist(context.getBean("c3"));
		et.commit();

	}

}
