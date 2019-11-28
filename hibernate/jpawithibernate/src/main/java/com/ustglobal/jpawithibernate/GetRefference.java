package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.dto.Product;

public class GetRefference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entTransaction=null;
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			entTransaction=entityManager.getTransaction();
			entTransaction.begin();
//			Product product1=entityManager.find(Product.class, 2); it always hit the db if value is not exist return null pointer exception
			Product product=entityManager.getReference(Product.class, 4);//if value present and only hit db otherqise create proxy instance return entity manager notfound exception
			System.out.println("id="+product.getId());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			
			entTransaction.commit();
		} catch (Exception e) {
			entTransaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}
}
