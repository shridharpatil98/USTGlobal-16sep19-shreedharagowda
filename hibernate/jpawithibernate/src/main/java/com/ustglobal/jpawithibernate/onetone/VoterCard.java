package com.ustglobal.jpawithibernate.onetone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="voter")
public class VoterCard {
	@Id
	private int vid;
	
	@Column
	private String name;
	
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
}
