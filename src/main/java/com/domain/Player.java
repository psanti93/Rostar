package com.domain;

public class Player {
	
	private int p_id;
	private String fname;
	private String lname;
	
	
	public Player () {}
	
	public Player(int p_id, String fname, String lname) {
		super();
		this.p_id = p_id;
		this.fname = fname;
		this.lname = lname;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
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
