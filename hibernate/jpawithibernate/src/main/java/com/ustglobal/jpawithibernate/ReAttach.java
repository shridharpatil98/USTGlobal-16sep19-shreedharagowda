package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.dto.Product;

public class ReAttach {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null; 
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Product product =entityManager.find(Product.class, 3);
			System.out.println(entityManager.contains(product));
			entityManager.detach(product);
			System.out.println(entityManager.contains(product));
			Product product2= entityManager.merge(product);
			product2.setPname("pen");
			
			entityTransaction.commit();
			entityManager.clear();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
	}
}
