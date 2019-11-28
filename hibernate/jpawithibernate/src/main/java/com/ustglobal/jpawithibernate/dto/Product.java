package com.ustglobal.jpawithibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 				//desc its entity class
@Table(name="product")  //name should be database table name
public class Product {	//POJO class
	
	@Id					//its desc the datamember is the primary key
	@GeneratedValue(strategy = GenerationType.AUTO)//Auto increment id value
	@Column(name="id")  //Column name its map to databse table column
	private int id;		
	
	@Column				//if data member is same name as table column no need to write column name
	private String pname;
	
	@Column
	private int quantity;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}
