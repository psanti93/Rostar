package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.DAO;
import com.domain.Coach;
import com.domain.Player;
import com.domain.Positions;

@RestController	//makes Controller class a spring bean, meaning its lifecycle is managed by the spring container, also lets Spring container know that is is a controller for a webapp giving it certain properties
public class Controller {
	
	@Autowired
	private DAO dao;
	
	@RequestMapping(value="players", method=RequestMethod.GET)
	public List<Player> getPlayers(){
		return dao.getPlayers();
	}
	
	@RequestMapping(value="positions", method=RequestMethod.GET)
	public List<Positions> getPositions(){
		return dao.getPositions();
	}
	
	@RequestMapping (value = "coaches", method = RequestMethod.GET)
	public List<Coach> getCoaches(){
		return dao.getCoaches();
	}
	
	@RequestMapping(value="create/player", method=RequestMethod.POST)
	public Player addPlayer(@RequestBody Player newPlayer) {
		try{
			dao.addPlayer(newPlayer);
			return newPlayer;
		}
		catch(Exception e){
			return null;
		}
	}
	
	//this transforms a java object into a jSON
	@RequestMapping(value="delete/player", method=RequestMethod.DELETE)
	public Player deletePlayer(@RequestBody Player removePlayer){
		try{
			dao.deletePlayer(removePlayer);
			return removePlayer;
		}
		catch(Exception e){
			return null;
		}
	}
	
	
	@RequestMapping (value ="change/player", method =RequestMethod.POST)
	public Player changePosition(@RequestBody Player newPosition){
		try{
			dao.changePosition(newPosition);
			return newPosition;
		}
		catch(Exception e){
			return null;
		}
	}
	
}
