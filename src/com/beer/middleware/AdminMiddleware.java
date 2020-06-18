package com.beer.middleware;

import com.beer.controller.UserController;
import com.beer.model.User;

public class AdminMiddleware {
	private UserController controller = new UserController();
	
	public void isAdmin(String key) throws Exception {
		User user = this.controller.get(key);

		if(!user.isAdmin()) 
			throw new Exception("Usuário não tem permissão para esta operação");
	}

}
