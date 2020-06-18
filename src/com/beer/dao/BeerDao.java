package com.beer.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.beer.model.Beer;

public class BeerDao {
	private Map<String, Beer> dao = new HashMap<String, Beer>();
	
	public Beer insert(String key, Beer beer) {
		beer.setId(key);
		
		return dao.put(key, beer);
	}
	
	public Beer update(Beer beer) {
		return dao.replace(beer.getId(), beer);
	}

	public ArrayList<Beer> list() {
		return new ArrayList<Beer>(dao.values());
	}
	
	public Beer get(String key) {
		return (Beer)dao.get(key);
	}
	
	public Beer delete(String key) {
		return (Beer)dao.remove(key);
	}
	
}
