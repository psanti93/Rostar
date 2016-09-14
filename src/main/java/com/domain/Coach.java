package com.domain;

import java.util.*;
import javax.persistence.*;

@Entity
@Table (name = "Coach_User")
public class Coach {
	
	@Id
	@GeneratedValue
	private int cId;
	
	private String fname;
	
	private String lname;
	
	@OneToMany	
	@JoinTable(
		name = "Coach_Player",
		joinColumns = @JoinColumn(name = "cId"),
		inverseJoinColumns = @JoinColumn(name = "pId")
	)
	private List<Player> players;

	
	//getters and setters
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	 
}