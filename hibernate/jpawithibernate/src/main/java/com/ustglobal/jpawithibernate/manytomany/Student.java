package com.ustglobal.jpawithibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	@Column
	private int sid;
	@Column
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns = @JoinColumn(name="sid"),
	inverseJoinColumns = @JoinColumn(name="cid"))
	private List<Course> courses;
}
