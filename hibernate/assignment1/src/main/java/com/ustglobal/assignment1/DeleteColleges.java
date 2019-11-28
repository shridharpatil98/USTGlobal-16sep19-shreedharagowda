package com.ustglobal.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.assignment1.dto.Colleges;

public class DeleteColleges {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("student");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Colleges colleges = entityManager.find(Colleges.class, 1);
			entityManager.remove(colleges);
			entityTransaction.commit();
			System.out.println("row deleted");
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
