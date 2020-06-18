package com.beer.controller;

import java.util.ArrayList;

import com.beer.dao.UserDao;
import com.beer.model.User;

public class UserController {
	UserDao dao = new UserDao();
	
	public User get(String key) throws Exception {
		User user = this.dao.get(key);
		
		if(user == null) throw new Exception("Id inexistente");
		
		return user;
	}
	
	public ArrayList<User> list() {
		return this.dao.list();
	}
}
