package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Colleges;

public class InsertColleges {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityTransaction entityTransaction=null;
	EntityManager entityManager=null;
	Colleges colleges=new Colleges();
	colleges.setId(1);
	colleges.setName("SSIT");
	colleges.setLocation("tumkur");
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("student");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(colleges);
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
