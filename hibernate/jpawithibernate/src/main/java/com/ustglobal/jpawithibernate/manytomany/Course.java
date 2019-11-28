package com.ustglobal.jpawithibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
public class Course {
	@Id

	@Column
	private int cid;
	@Column
	private String name;

	@Exclude
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	private List<Student> students;

}
