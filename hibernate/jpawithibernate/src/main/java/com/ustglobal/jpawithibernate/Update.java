package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.dto.Product;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entTransaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();
		entTransaction=entityManager.getTransaction();
		entTransaction.begin();
		Product product=entityManager.find(Product.class, 1);
		
		product.setPname("Laptop");
		
		System.out.println("Updated Record");
		entTransaction.commit();
	} catch (Exception e) {
		entTransaction.rollback();
		e.printStackTrace();
	}
	entityManager.close();
}
}
