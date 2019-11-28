package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.onemany.Pencil;
import com.ustglobal.jpawithibernate.onemany.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		PencilBox pencilBox=new PencilBox();
		pencilBox.setBid(1);
		pencilBox.setColor("red");
		Pencil pencil=new Pencil();
		pencil.setPid(1);
		pencil.setName("Apsara");
		pencil.setPencilBox(pencilBox);
		Pencil pencil1=new Pencil();
		pencil1.setPid(2);
		pencil1.setName("Nataraja");
		pencil1.setPencilBox(pencilBox);

		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			entityTransaction.commit();
			entityManager.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			entityTransaction.rollback();
		}
	}
}
