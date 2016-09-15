package com.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private int pId;
	
	private String fname;
	
	private String lname;
	
	@OneToMany(cascade = {CascadeType.REMOVE})	
	@JoinTable(
		name = "Coach_Player",
		joinColumns = @JoinColumn(name = "pId"),
		inverseJoinColumns = @JoinColumn(name = "cId")
	)
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

	public Positions getPosition() {
		return position;
	}

	public void setPosition(Positions position) {
		this.position = position;
	}

}
