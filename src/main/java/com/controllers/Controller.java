package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DAO.DAO;
import com.domain.Player;
import com.domain.Positions;

@RestController
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
	
	@RequestMapping(value="create/player", method=RequestMethod.POST)
	public void addPlayer(@RequestBody Player newPlayer) {
		dao.addPlayer(newPlayer);
	}
	
}
