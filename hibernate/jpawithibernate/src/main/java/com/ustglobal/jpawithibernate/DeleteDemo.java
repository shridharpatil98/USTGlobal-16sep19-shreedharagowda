package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.dto.Product;

public class DeleteDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Product product=entityManager.find(Product.class, 1);
		
		entityManager.remove(product);
		System.out.println("product deleted");
		entityTransaction.commit();
		
	} catch (Exception e) {
		e.printStackTrace();

		entityTransaction.rollback();
	}
	entityManager.close();
}
}
