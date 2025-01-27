package com.lognsys.babycare.core.rest.client;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.lognsys.babycare.core.funfacts.Compound;
import com.lognsys.babycare.core.user.User;

public class PregnancyClient {
	/**
	 * server URL ending with the servlet mapping on which the application can
	 * be reached.
	 */
	private static final String BASE_URL = "http://localhost:8080/ayurbaby/pregnancy";

	private RestTemplate restTemplate = new RestTemplate();

	@Test
	public void listComounds() {
		String url = BASE_URL + "/compounds/fats";
		Compound[] compound = restTemplate.getForObject(url, Compound[].class);
		Assert.assertTrue(compound.length > 0);

	}

	@Test
	public void addUser() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String user = "{'auth_id': 'fb1234566','firstname': 'priyank',"
				+ "'lastname': 'doshi', 'lastmenperiod': '22122015','email': 'pdoshi@ucop.edu'"
				+ "'location': 'Fremont', 'phone': '4086673759', 'birthdate': 'Jan 4 1984', 'provenance': 'facebook'"
				+ "'duedate': 'Sep 08 2015', 'notification': '0', 'stage_id': '9', 'registration': 'abcdef00987ghijklmn09pqrst6687'}";

		HttpEntity<String> entity = new HttpEntity<String>(user, headers);

		String url = BASE_URL + "/adduser";
		restTemplate.postForObject(url, entity, User.class);
	}

	@Test
	public void updateRegistration() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String user = "{'email': 'pdoshi@ucop.edu'," + "'registration': 'abcdef00987ghijklmn09pqrst6687'}";

		HttpEntity<String> entity = new HttpEntity<String>(user, headers);

		String url = BASE_URL + "/adduser";
		restTemplate.postForObject(url, entity, User.class);
	}

}
