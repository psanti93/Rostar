package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Coach_User")
public class Coach {
	@Id
	@Column(name = "C_ID")
	private int c_id;
	
	@Column(name = "C_FNAME")
	private String fname;
	
	@Column(name = "C_LNAME")
	private String lname;
	
	public Coach () {}
	public Coach(int c_id, String fname, String lname) {
		super();
		this.c_id = c_id;
		this.fname = fname;
		this.lname = lname;
	}
	
	
	public int getCid() {
		return c_id;
	}
	public void setCid(int c_id) {
		this.c_id = c_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	 
}
