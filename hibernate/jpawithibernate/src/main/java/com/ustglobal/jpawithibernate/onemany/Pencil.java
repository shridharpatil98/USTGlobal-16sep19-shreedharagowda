package com.ustglobal.jpawithibernate.onemany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Pencil {
	@Id
	@Column
	private int pid;
	
	@Column
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable = false)
	private PencilBox pencilBox;

}
