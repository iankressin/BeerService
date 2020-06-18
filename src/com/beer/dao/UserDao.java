package com.beer.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.beer.model.User;

public class UserDao {
	private Map<String, User> dao = new HashMap<String, User>();
	
	public UserDao() {
		this.seed();
	}
	
	public User get(String key) {
		return (User)dao.get(key);
	}
	
	public ArrayList<User> list() {
		return new ArrayList<User>(dao.values());
	}
	
	private void seed() {
		User admin = new User("Ian", "00000000000", true);
		User notAdmin = new User("Ana", "11111111111", false);
		
		this.dao.put(admin.getCpf(), admin);
		this.dao.put(notAdmin.getCpf(), notAdmin);
	}
}
