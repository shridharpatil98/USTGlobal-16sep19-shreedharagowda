package com.ustglobal.lms.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserBean {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	@Column
	private String role;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sid", nullable = true)
	private StudentBean student;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "lid", nullable = true)
	private LibrarianBean librarian;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "aid", nullable = true)
	private AdminBean admin;
	
	public int getId() {
		return id;
	}
	public StudentBean getStudent() {
		return student;
	}
	public void setStudent(StudentBean student) {
		this.student = student;
	}
	public LibrarianBean getLibrarian() {
		return librarian;
	}
	public void setLibrarian(LibrarianBean librarian) {
		this.librarian = librarian;
	}
	public AdminBean getAdmin() {
		return admin;
	}
	public void setAdmin(AdminBean admin) {
		this.admin = admin;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
