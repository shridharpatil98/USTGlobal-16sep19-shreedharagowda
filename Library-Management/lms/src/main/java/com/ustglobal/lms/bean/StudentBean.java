package com.ustglobal.lms.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

import net.bytebuddy.build.ToStringPlugin.Exclude;


@Entity
@Table(name="student")
public class StudentBean {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column
	private String sname;
	
	@Column(unique = true)
	private String usn;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	@Column
	private String branch;
	@Column
	private char section;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private int sem;
	@Column
	private String password;
	@JsonIgnore
	@Exclude
	@OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
	private UserBean user;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "student")
	private List<BookIssueBean> bookIssues;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public List<BookIssueBean> getBookIssues() {
		return bookIssues;
	}
	public void setBookIssues(List<BookIssueBean> bookIssues) {
		this.bookIssues = bookIssues;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
