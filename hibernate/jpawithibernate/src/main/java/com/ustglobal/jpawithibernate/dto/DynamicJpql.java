package com.ustglobal.jpawithibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicJpql {
public static void main(String[] args) {
	EntityManager entityManager=null;
	
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String jpql="update Product set pname=:name where id=:pid";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("name", "Mobiles");
		query.setParameter("pid", 3);
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

