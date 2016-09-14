package com.domain;

import java.util.*;
import javax.persistence.*;

@Entity
public class Positions {
	
	@Id
	@GeneratedValue
	private int posId;

	private String position;
	
	@OneToMany(mappedBy = "position")
	private List<Player> players;
	

	//getters and setters
	public int getPosId() {
		return posId;
	}

	public void setPosId(int posId) {
		this.posId = posId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
}
