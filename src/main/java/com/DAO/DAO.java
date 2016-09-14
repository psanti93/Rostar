package com.DAO;

import java.util.List;

import com.domain.Coach;
import com.domain.Player;
import com.domain.Positions;

public interface DAO {
	//CRUD
	
	//1. As a coach I can view my players 
		public List<Player> getPlayers();
		public List <Positions> getPositions();
		
	//2. As a Coach I can update my roster
		public void addPlayer (Player newPlayer);
		public void deletePlayer (Player removePlayer);
		
	//3. As a Coach I can change my player's position
		public void changePosition (Player newPosition);
	
	
	//3. As a player I can view my coaches
		public List <Coach> getCoaches(); 
		


}
