package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.bean.UserBean;
import com.ustglobal.lms.dao.AdminDAO;
import com.ustglobal.lms.validation.LibraryValidation;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;

	@Override
	public UserBean userLogin(String email, String password) {
		if(LibraryValidation.email(email) && 
				LibraryValidation.password(password)) {
		return dao.userLogin(email, password);
	}else {
		return null;
	}
	}
	@Override
	public AdminBean login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		if(LibraryValidation.email(bean.getEmail()) &&
				LibraryValidation.name(bean.getSname()) && 
				LibraryValidation.password(bean.getPassword())) {
			return dao.registerStudent(bean);
		}else {
			return false;
		}
	}

	@Override
	public boolean registerLibrarian(LibrarianBean bean) {
		if(LibraryValidation.email(bean.getEmail()) &&
				LibraryValidation.name(bean.getName()) && 
				LibraryValidation.password(bean.getPassword())) {
			return dao.registerLibrarian(bean);
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public boolean deleteLibrarian(int id) {
		return dao.deleteLibrarian(id);
	}
	@Override
	public List<LibrarianBean> getAllLibrarians() {
		return dao.getAllLibrarians();
	}
	@Override
	public List<StudentBean> getAllStudents() {
		return dao.getAllStudents();
	}
}
