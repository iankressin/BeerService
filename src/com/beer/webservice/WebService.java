package com.beer.webservice;

import javax.xml.ws.Endpoint;

public class WebService {

	public static void main(String[] args) {
		int PORT = 3001;
		String URL = "http://localhost:" + PORT + "/beerservice";
		BeerWebService beerWebService = new BeerWebService();

		System.out.println("Servindo no endereço: " + URL);
		
		Endpoint.publish(URL, beerWebService);
	}

}
