package com.ustglobal.jpawithibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
public static void main(String[] args) {
	EntityManager entityManager=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String jpql="update Product set pname='bike' where id=2";
		Query query=entityManager.createQuery(jpql);
		int i=query.executeUpdate();
		System.out.println(i+"row updated");
		entityTransaction.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	entityManager.close();
}
}
