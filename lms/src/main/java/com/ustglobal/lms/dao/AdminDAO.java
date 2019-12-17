package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.bean.UserBean;

public interface AdminDAO {
	public AdminBean login(int id, String password);
	public boolean registerStudent(StudentBean bean);
	public boolean registerLibrarian(LibrarianBean bean);
	public boolean deleteStudent(int id);
	public boolean deleteLibrarian(int id);
	List<StudentBean> getAllStudents();
	List<LibrarianBean> getAllLibrarians();
	public UserBean userLogin(String email, String password);
}
