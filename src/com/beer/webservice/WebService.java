package com.beer.webservice;

import javax.xml.ws.Endpoint;

public class WebService {

	public static void main(String[] args) {
		int PORT = 3001;
		String URL = "http://localhost:" + PORT;
		
		BeerWebService beerWebService = new BeerWebService();
		UserWebService userWebService = new UserWebService();

		Endpoint.publish(URL + "/beerservice", beerWebService);
		Endpoint.publish(URL + "/userservice", userWebService);
		
		System.out.println("Servindo no endereço: " + URL);
	}

}
