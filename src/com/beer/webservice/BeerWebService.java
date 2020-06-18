package com.beer.webservice;

import javax.jws.WebService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import com.beer.controller.BeerController;
import com.beer.middleware.AdminMiddleware;
import com.beer.model.Beer;

@WebService
public class BeerWebService {
	private BeerController controller = new BeerController();
	private AdminMiddleware middleware = new AdminMiddleware();
	
	@WebMethod(operationName="createBeer")
	@WebResult(name="beer")
	public Beer createBeer(
			@WebParam(name = "userId", header = true) String key,
			@WebParam(name = "beer") Beer beer
	) throws Exception {	
		try {
			middleware.isAdmin(key);
			
			this.controller.create(beer);
		} catch(Exception exception) {
			throw exception;
		}
		
		return beer;
	}

	@WebMethod(operationName="getBeerById")
	@WebResult(name="beer")
	public Beer getBeerById(@WebParam(name = "id") String key) throws Exception {
		try {
			return this.controller.get(key);
		} catch (Exception exception) {
			throw exception;
		}
	}
	
	@WebMethod(operationName="updateBeer")
	@WebResult(name="beer")
	public Beer updateBeer(
			@WebParam(name = "userId", header = true) String key,
			@WebParam(name = "beer") Beer beer
	) throws Exception {
		try {
			middleware.isAdmin(key);
			
			Beer updatedBeer = this.controller.update(beer);
			
			return updatedBeer;
		} catch(Exception exception) {
			throw exception;
		}
	}
	
	@WebMethod(operationName="deleteBeer")
	@WebResult(name="beer") 
	public Beer deleteBeer(
			@WebParam(name = "userId", header = true) String userId,
			@WebParam(name = "id") String key
	) throws Exception {
		try {
			middleware.isAdmin(userId);
			
			return this.controller.delete(key);
		} catch (Exception exception) {
			throw exception;
		}
	}

	@WebMethod(operationName="listBeers")
	@WebResult(name="beerList")
	public ArrayList<Beer> listBeers() {
		return this.controller.list();
	}
	
}
