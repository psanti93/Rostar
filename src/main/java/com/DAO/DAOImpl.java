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
		start.save(newPosition);
		tx.commit();
		
		start.close(); 
		
		
	}
	

	@Override
	public List<Coach> getCoaches() {
		
		Session start = sf.openSession();
		Criteria criteria = start.createCriteria(Coach.class);
		//this returns the list of coaches
		List<Coach> myCoaches = criteria.list();
		start.close();
		
		if(myCoaches.size() > 0){
			return myCoaches;
		}
		else{
		return null;
		}
	}

}
