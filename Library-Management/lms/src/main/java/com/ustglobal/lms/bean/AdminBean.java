package com.ustglobal.lms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "admin")
public class AdminBean {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	
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
	@OneToOne(mappedBy = "admin")
	private UserBean user;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
