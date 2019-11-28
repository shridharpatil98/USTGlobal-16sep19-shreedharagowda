package com.ustglobal.jpawithibernate.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();

		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String jpql="delete from Product where id=2";
		Query query=entityManager.createQuery(jpql);
		int i=query.executeUpdate();
		System.out.println(i+"row updated");
		entityTransaction.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		entityTransaction.rollback();
	}finally {

		entityManager.close();
	}

}
}
