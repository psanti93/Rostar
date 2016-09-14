package com.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Coach;
import com.domain.Player;
import com.domain.Positions;

//tells Spring that it's going to manage this class
//DAO Impl relies on sf 
//makes this into a Spring bean
@Component
public class DAOImpl implements DAO {
	
	//autowire makes it so that this variable will always have a value for you 
	@Autowired
	SessionFactory sf;

	@Override
	public List<Player> getPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Positions> getPositions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPlayer(Player newPlayer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePlayer(Player removePlayer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePosition(Player newPosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Coach> getCoaches() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
