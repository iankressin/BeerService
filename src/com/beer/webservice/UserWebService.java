package com.beer.webservice;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.beer.controller.UserController;
import com.beer.model.User;

@WebService
public class UserWebService {
	private UserController controller = new UserController();
	
	@WebMethod(operationName="getUserById")
	@WebResult(name="user")
	public User getUserById(@WebParam(name = "id") String key) throws Exception {
		try {
			return this.controller.get(key);	
		} catch (Exception exception) {
			throw exception;
		}
	}

	public ArrayList<User> listUsers() {
		return this.controller.list();
	}
}
