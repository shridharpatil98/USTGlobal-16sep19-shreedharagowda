package com.ustglobal.jpawithibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithibernate.dto.Product;

public class SelectAll {
	public static void main(String[] args) {
//		String jpql="from Product";
		String jpql="select pname from Product";
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
		Query query=entityManager.createQuery(jpql);
		List<String> list=query.getResultList();
		for (String product : list) {
			System.out.println(product);
//			System.out.println(product.getId());
//			System.out.println(product.getQuantity());
		}
		entityManager.close();
	}
}