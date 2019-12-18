package com.ustglobal.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.hibernate.service.spi.Manageable;
import org.springframework.stereotype.Repository;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.bean.UserBean;
@Repository
public class AdminDaoImpl implements AdminDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserBean userLogin(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from UserBean where email=:email and password=:password";
		TypedQuery<UserBean> query=manager.createQuery(jpql, UserBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		UserBean bean=query.getSingleResult();
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}
	@Override
	public AdminBean login(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from AdminBean where id=:id and password=:password";
		TypedQuery<AdminBean> query=manager.createQuery(jpql, AdminBean.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		AdminBean bean=query.getSingleResult();
		if(bean!=null) {
			return bean;
		}else {
			return null;
		}
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			UserBean user = new UserBean();
			user.setEmail(bean.getEmail());
			user.setPassword(bean.getPassword());
			user.setRole("student");
			user.setStudent(bean);
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			UserBean user = new UserBean();
			user.setEmail(bean.getEmail());
			user.setLibrarian(bean);
			user.setPassword(bean.getPassword());
			user.setRole("librarian");
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}	}

	@Override
	public boolean deleteStudent(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			StudentBean bean=manager.find(StudentBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean deleteLibrarian(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			LibrarianBean bean=manager.find(LibrarianBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	@Override
	public List<LibrarianBean> getAllLibrarians() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from LibrarianBean";
		TypedQuery<LibrarianBean> query=manager.createQuery(jpql, LibrarianBean.class);
		List<LibrarianBean> beans=query.getResultList();
		return beans;
	}
	@Override
	public List<StudentBean> getAllStudents() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from StudentBean";
		TypedQuery<StudentBean> query=manager.createQuery(jpql, StudentBean.class);
		List<StudentBean> beans=query.getResultList();
		return beans;
	}
}