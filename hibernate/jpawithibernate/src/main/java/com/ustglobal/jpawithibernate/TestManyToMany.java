package com.ustglobal.jpawithibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithibernate.manytomany.Course;
import com.ustglobal.jpawithibernate.manytomany.Student;

public class TestManyToMany {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	Course course=new Course();
	course.setCid(1);
	course.setName("python");
	Course course1=new Course();
	course1.setCid(2);
	course1.setName("Java");
	
	Student student=new Student();
	student.setName("Ram");
	student.setSid(1);
	List<Course> courses=new ArrayList<Course>();
	courses.add(course1);
	courses.add(course);
	student.setCourses(courses);
	try {
		entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
