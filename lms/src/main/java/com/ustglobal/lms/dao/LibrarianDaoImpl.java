package com.ustglobal.lms.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.bean.BookBean;
import com.ustglobal.lms.bean.BookIssueBean;
import com.ustglobal.lms.bean.LibrarianBean;
@Repository
public class LibrarianDaoImpl implements LibrarianDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public List<BookBean> getAllBooks() {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "SELECT bid, name, count(*) FROM BookBean";
			TypedQuery<BookBean> query = manager.createQuery(jpql, BookBean.class);
			List<BookBean> beans = query.getResultList();
			return beans;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public LibrarianBean login(String email, String password) {
	EntityManager manager=factory.createEntityManager();
	String jpql="from LibrarianBean where email=:email and password=:password";
	try {
		TypedQuery<LibrarianBean> query=manager.createQuery(jpql, LibrarianBean.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		LibrarianBean bean=query.getSingleResult();
		return bean;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	}
	
	@Override
	public boolean addBook(BookBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean updateBook(BookBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			BookBean bookBean=manager.find(BookBean.class, bean.getBid());
			bookBean.setAuthor(bean.getAuthor());
			bookBean.setBid(bean.getBid());
			bookBean.setName(bean.getName());
			bookBean.setPublication(bean.getPublication());
			bookBean.setStatus(bean.getStatus());
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}

	@Override
	public boolean removeBook(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		BookBean bean=manager.find(BookBean.class, id);
		transaction.begin();
		try {
			manager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<BookIssueBean> requestedIssue() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookIssueBean where status=:status";
		TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
		query.setParameter("status", "request");
		List<BookIssueBean> bookBeans=query.getResultList();
		return bookBeans;
	}

	@Override
	public List<BookIssueBean> requestedReturn() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from BookIssueBean where status=:status";
		TypedQuery<BookIssueBean> query=manager.createQuery(jpql, BookIssueBean.class);
		query.setParameter("status", "return");
		List<BookIssueBean> bookBeans=query.getResultList();
		return bookBeans;
	}
	@Override
	public boolean acceptBook(int sid,int bid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String accept="accept";
		String jpql="update BookIssueBean set issueDate=:issueDate, status=:status where bid=:bid and sid=:sid";
		try {
			Query query=manager.createQuery(jpql);
			query.setParameter("sid", sid);
			query.setParameter("bid", bid);
			query.setParameter("status", "accept");
			java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
			System.out.println(sqlDate);
			query.setParameter("issueDate",sqlDate);
			query.executeUpdate();
			BookBean bookBean = manager.find(BookBean.class, bid);
			bookBean.setStatus(accept);
//			manager.persist(bookBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
	@Override
	public boolean acceptReturn(int sid, int bid) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String accept="accept";
		String jpql="update BookIssueBean set returnDate=:issueDate, status=:status where bid=:bid and sid=:sid";
		try {
			Query query=manager.createQuery(jpql);
			query.setParameter("sid", sid);
			query.setParameter("bid", bid);
			query.setParameter("status", "available");
			java.sql.Date sqlDate=new java.sql.Date(new Date().getTime());
			System.out.println(sqlDate);
			query.setParameter("issueDate",sqlDate);
			query.executeUpdate();
			BookBean bookBean = manager.find(BookBean.class, bid);
			bookBean.setStatus("available");
//			manager.persist(bookBean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return false;
		}
	}
}
