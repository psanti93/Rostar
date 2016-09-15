package com.domain;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private int pId;
	
	private String fname;
	
	private String lname;
	
	@ManyToOne	//CascadeType.REMOVE deletes are rows in all tables that point to the player that was deleted
	@JoinColumn(name = "cId")
	private List<Coach> coaches;
	
	@ManyToOne(targetEntity = Positions.class)
	@JoinColumn(name = "posId")
	private Positions position;

	//getters and setters
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
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

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public Positions getPosition() {
		return position;
	}

	public void setPosition(Positions position) {
		this.position = position;
	}
}
