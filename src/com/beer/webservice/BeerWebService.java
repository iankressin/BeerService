package com.beer.webservice;

import javax.jws.WebService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import com.beer.controller.BeerController;
import com.beer.model.Beer;

@WebService
public class BeerWebService {
	private BeerController controller = new BeerController();
	
	@WebMethod(operationName="createBeer")
	@WebResult(name="beer")
	public Beer createBeer(@WebParam(name = "beer") Beer beer) {
		
		try {
			this.controller.create(beer);
		} catch(Exception exception) {
			return null;
		}
		
		return beer;
	}

	@WebMethod(operationName="getBeerById")
	@WebResult(name="beer")
	public Beer getBeerById(@WebParam(name = "id") String key) {
		try {
			return this.controller.get(key);
		} catch (Exception exception) {
			return null;
		}
	}
	
	@WebMethod(operationName="updateBeer")
	@WebResult(name="beer")
	public Beer updateBeer(@WebParam(name = "beer") Beer beer) {
		try {
			Beer updatedBeer = this.controller.update(beer);
			
			return updatedBeer;
		} catch(Exception exception) {
			return null;
		}
	}
	
	@WebMethod(operationName="deleteBeer")
	@WebResult(name="beer") 
	public Beer deleteBeer(@WebParam(name = "id") String key) {
		try {
			return this.controller.delete(key);
		} catch (Exception exception) {
			return null;
		}
	}
	
	@WebMethod(operationName="listBeers")
	@WebResult(name="beerList")
	public ArrayList<Beer> listBeers() {
		return this.controller.list();
	}
	
}
