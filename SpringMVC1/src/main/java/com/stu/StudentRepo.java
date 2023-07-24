package com.stu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("one");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public StudentData savaData(StudentData studentData) {
		et.begin();
		em.persist(studentData);
		et.commit();
		return studentData;
	}

}
