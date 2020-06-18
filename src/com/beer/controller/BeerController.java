package com.beer.controller;

import com.beer.model.Beer;

import java.util.ArrayList;

import com.beer.dao.BeerDao;

public class BeerController {
	BeerDao dao = new BeerDao();
	
	public Beer create(Beer beer) throws Exception {
		String key = this.generateKey(
			beer.getCountryCode(),
			beer.getBrand(),
			beer.getName()
		);
		
		if(this.beerExist(key)) {
			throw new Exception("Cerveja já cadastrada");
		}
		
		Beer newBeer = (Beer) this.dao.insert(key, beer);
		
		return newBeer;
	}
	
	public Beer get(String key) throws Exception {
		Beer beer = this.dao.get(key);
		
		if(beer == null) throw new Exception("Id inexistente");
		
		return beer;
	}
	
	public Beer update(Beer beer) throws Exception{
		String key = beer.getId();
		
		if(!this.beerExist(key)) {
			throw new Exception("Cerveja não cadastrada");
		}
		
		return this.dao.update(beer);
	}
	
	public Beer delete(String key) throws Exception{
		if(!beerExist(key)) {
			throw new Exception("Cerveja não cadastrada");
		}
		
		return this.dao.delete(key);
	}
	
	public ArrayList<Beer> list(){
		return this.dao.list();
	}
	
	private boolean beerExist(String key) {
		Beer beer = this.dao.get(key);
				
		if(beer == null) return false;
		else return true;
	}
	
	private String generateKey(String countryCode, String brand, String name) {
		return countryCode + '-' + brand + '-' + name;
	}
}
