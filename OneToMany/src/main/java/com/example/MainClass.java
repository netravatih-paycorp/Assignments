package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("one");
       EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
       
       ApplicationContext context = new ClassPathXmlApplicationContext("com/example/New.xml");
       
       Mobile m = new Mobile();
       m.setBrand("Vivo");
       m.setCost(35000);
       
       SIM s1 = new SIM();
       s1.setName("Jio");
       s1.setCost(350);
       
       SIM s2 = new SIM();
       s2.setName("Airtel");
       s2.setCost(499);
       
       List<SIM> list = new ArrayList<SIM>();
       list.add(s1);
       list.add(s2);
       
       m.setSims(list);
       s1.setMobile(m);
       s2.setMobile(m);
       
       et.begin();
       em.persist(m);
       em.persist(s1);
       em.persist(s2);
       em.persist(context.getBean("m1"));
       em.persist(context.getBean("s3"));
       em.persist(context.getBean("s4"));
       
       et.commit();
       
       
       
       
	}
}
