package com.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
	@Transactional //opens and closes the session for you automatically 
	public List<Player> getPlayers() {
		List<Player> players = sf.getCurrentSession().createCriteria(Player.class).list();
		return players;
	}

	@Override
	@Transactional
	public List<Positions> getPositions() {
		System.out.println(sf.getCurrentSession().createCriteria(Positions.class).list());
		return sf.getCurrentSession().createCriteria(Positions.class).list();
	}

	@Override
	@Transactional
	public void addPlayer(Player newPlayer) {
		sf.getCurrentSession().save(newPlayer);
	}


	@Override
	public void deletePlayer(Player removePlayer) {
		
		Session start = sf.openSession();
				
		Transaction tx = start.beginTransaction();
		start.delete(removePlayer);
		tx.commit();
		
		start.close();
	
	}
	

	@Override
	public void changePosition(Player newPosition) {
		
		Session start = sf.openSession();
		Transaction tx = start.beginTransaction();
		
		Player oldPlayer = (Player) start.get(Player.class, newPosition.getpId());
		if(newPosition.getLname() != null){
			oldPlayer.setLname(newPosition.getLname());
		}
		if(newPosition.getFname() != null){
			oldPlayer.setFname(newPosition.getFname());
		}
		if(newPosition.getPosition() != null){
			oldPlayer.setPosition(newPosition.getPosition());
		}
		start.save(oldPlayer);
		tx.commit();
		start.close(); 
	}
	

	@Override
	public List<Coach> getCoaches() {
		
		Session start = sf.openSession();
		Criteria criteria = start.createCriteria(Coach.class);
		//this returns the list of coaches
		List<Coach> myCoaches = criteria.list();
		for(Coach c : myCoaches){
			c.getPlayers();
		}
		start.close();
		
		if(myCoaches.size() > 0){
			return myCoaches;
		}
		else{
		return null;
		}
	}

}
