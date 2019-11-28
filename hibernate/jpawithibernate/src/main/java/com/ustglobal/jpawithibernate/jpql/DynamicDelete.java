package com.ustglobal.jpawithibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDelete {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();

			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="delete from Product where id=:pid";
			Query query=entityManager.createQuery(jpql);
			query.setParameter("pid", 3);
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
