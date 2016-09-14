package com.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAOImpl {
	
	@Autowired
	SessionFactory sf;
	
}
