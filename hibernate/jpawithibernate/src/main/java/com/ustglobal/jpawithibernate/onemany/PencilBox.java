package com.ustglobal.jpawithibernate.onemany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
public class PencilBox {
	@Id
	@Column	
	private int bid;
	
	@Column
	private String color;
	
	@Exclude
	@OneToMany(mappedBy = "pencilBox")
	private List<Pencil> pencil;

}
