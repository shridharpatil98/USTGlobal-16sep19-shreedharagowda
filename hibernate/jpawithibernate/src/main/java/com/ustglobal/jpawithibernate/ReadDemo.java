package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Product product = entityManager.find(Product.class, 2);
		System.out.println("id="+product.getId()+" name="+product.getPname()+" quantity="+product.getQuantity());
		 entityManager.close();
	}
}
