package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
       EntityManagerFactory emf =Persistence.createEntityManagerFactory("one");
       EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
       
       ApplicationContext con = new ClassPathXmlApplicationContext("com/ty/Configuration.xml");
       
       Person p1= new Person();
       p1.setName("pushpa");
       p1.setPhno("9875468889");
       p1.setEmail("pushpa@gmail.com");
       
       PanCard pc = new PanCard();
       pc.setPanno("KAOPl987L");
       pc.setAddress("Dharwad");
       
       
       
       p1.setCard(pc);
      
       et.begin();
       em.persist(p1);
       em.persist(pc);
       em.persist(con.getBean("person"));
       em.persist(con.getBean("pan"));
      
       et.commit();
	}
}
