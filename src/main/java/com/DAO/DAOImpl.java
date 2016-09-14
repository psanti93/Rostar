package com.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.domain.Player;

@Component
public class DAOImpl {
	
	@Autowired
	SessionFactory sf;

}
