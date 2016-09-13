package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "POSITION_TABLE")
public class Positions {
	
	@Id
	@Column(name = "POS_ID")
	private int pos_id;
	
	@Column(name="POSITION_NAME")
	private String position;
	
	
	
	public Positions () {}
	
	public Positions(int pos_id, String position) {
		super();
		this.pos_id = pos_id;
		this.position = position;
	}
	public int getPos_id() {
		return pos_id;
	}
	public void setPos_id(int pos_id) {
		this.pos_id = pos_id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	 

}
