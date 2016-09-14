package com.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public List<Player> getPlayers() {
		return sf.getCurrentSession().createCriteria(Player.class).list();
	}

	@Override
	@Transactional
	public List<Positions> getPositions() {
		return sf.getCurrentSession().createCriteria(Positions.class).list();
	}

	@Override
	@Transactional
	public void addPlayer(Player newPlayer) {
		sf.getCurrentSession().save(newPlayer);
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
