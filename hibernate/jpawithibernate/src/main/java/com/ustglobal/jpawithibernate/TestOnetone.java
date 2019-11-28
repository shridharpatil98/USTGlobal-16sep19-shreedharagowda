package com.ustglobal.jpawithibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.onetone.Person;
import com.ustglobal.jpawithibernate.onetone.VoterCard;

public class TestOnetone {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		VoterCard voterCard=new VoterCard();
		voterCard.setVid(1);
		voterCard.setName("Raj");
		Person person=new Person();
		person.setPid(1);
		person.setName("Darshan");
		person.setVoterCard(voterCard);

		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager= entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard=entityManager.find(VoterCard.class, 1);
			System.out.println(vCard.getPerson().getName());
//			entityManager.persist(person);
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
