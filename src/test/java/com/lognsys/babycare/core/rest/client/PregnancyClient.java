package com.lognsys.babycare.core.rest.client;

import org.junit.Assert;
import org.junit.Test;

import com.lognsys.babycare.core.funfacts.*;

import org.springframework.web.client.RestTemplate;

public class PregnancyClient
{
	/**
	 * server URL ending with the servlet mapping on which the application can be reached.
	 */
	private static final String BASE_URL = "http://localhost:8080/ayurbaby/pregnancy";
	
	private RestTemplate restTemplate = new RestTemplate();
	
	
	@Test 
	public void listComounds() {
		String url = BASE_URL + "/compounds/fats";
		Compound[] compound = restTemplate.getForObject(url, Compound[].class);
		Assert.assertTrue(compound.length > 0);
	
	}
}
