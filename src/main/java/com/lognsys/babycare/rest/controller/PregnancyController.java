 package com.lognsys.babycare.rest.controller;

import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.joda.time.IllegalFieldValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lognsys.babycare.core.Pregnancy;
import com.lognsys.babycare.core.food.Nutritional;
import com.lognsys.babycare.core.food.Ayurvedic;
import com.lognsys.babycare.core.funfacts.Compound;
import com.lognsys.babycare.core.user.User;
import com.lognsys.babycare.core.PregnancyException;

@Controller
@RequestMapping("/pregnancy")
public class PregnancyController
{

	private final Logger LOG = Logger.getLogger(getClass());
	
	int mockStage = 0;
	
	@Autowired
	private Pregnancy pregnancy;

	@RequestMapping(value = "/compounds/all", method = RequestMethod.GET)
	public @ResponseBody
	List<Compound> getCompounds()
	{
		return pregnancy.getCompounds();
	}

	@RequestMapping(value = "/compounds/{name}", method = RequestMethod.GET)
	public @ResponseBody
	Compound getCompoundFacts(@PathVariable("name") String nutrient)
	{
		return pregnancy.getNutrientsFacts(nutrient);
		
	}
	
	/**
	 * 
	 * @param user
	 */
	@RequestMapping(value="/adduser")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		
		 pregnancy.saveOrUpdateUser(user);
		 
			return new ResponseEntity<>(HttpStatus.OK);
		
//		if(isSuccess)
//			return new ResponseEntity<>(HttpStatus.OK);
//		else
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/duedate/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	String pregnancyDueDate(@PathVariable("lmpDate") String lmpDate) throws PregnancyException
	{
		return pregnancy.calculateDueDate(lmpDate);
	}

	@RequestMapping(value = "/stage/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	int pregnancyStage(@PathVariable("lmpDate") String lmpDate) throws PregnancyException
	{
		return pregnancy.getPregnancyStage(lmpDate);
	}

	
	@RequestMapping(value = "/mockstage/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	int mockPregnancyStage(@PathVariable("lmpDate") String lmpDate) throws PregnancyException
	{
		if(mockStage > 9)
			mockStage = 0;
		
		mockStage++;
		
		return mockStage;
		//return pregnancy.getPregnancyStage(lmpDate);
	}

	
	
	
	
	@RequestMapping(value = "/week/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	int pregnancyWeek(@PathVariable("lmpDate") String lmpDate) throws PregnancyException
	{
		return pregnancy.getPregnancyWeek(lmpDate);
	}

	@RequestMapping(value = "/food/{stage}/nutritional", method = RequestMethod.GET)
	public @ResponseBody
	List<Nutritional> recommendedNutritionalPegnancyFood(@PathVariable("stage") int stage)
	{
		return pregnancy.recommendedPregnancyFood(stage).getNutritionalFood();

	}

	@RequestMapping(value = "/food/{stage}/ayurvedic", method = RequestMethod.GET)
	public @ResponseBody
	List<Ayurvedic> recommendedAyurvedicPegnancyFood(@PathVariable("stage") int stage)
	{
		return pregnancy.recommendedPregnancyFood(stage).getAyurvedicFood();

	}
	
	
	

	/**
	 * Maps IllegalArgumentExceptions to a 404 Not Found HTTP status code.
	 */
	@ResponseStatus(value=org.springframework.http.HttpStatus.NOT_FOUND, reason="result not found")
	@ExceptionHandler({ EmptyResultDataAccessException.class, NoResultException.class })
	public void handleNotFound(Exception ex, HttpServletResponse response)
	{
		LOG.error("Exception is: ", ex);
		// return empty 404
	}

	/**
	 * Maps IllegalArgumentExceptions to a 400 Bad Request HTTP status code.
	 */
	@ResponseStatus(value=org.springframework.http.HttpStatus.BAD_REQUEST, reason="Bad data")
	@ExceptionHandler({ IllegalArgumentException.class, IllegalFieldValueException.class })
	public void handleBadData(Exception ex, HttpServletResponse response)
	{
		LOG.error("Bad data Exception is: ", ex);
		// return empty 400
	}
	
	@ResponseStatus(value=org.springframework.http.HttpStatus.NOT_ACCEPTABLE, reason="Invalid input data")
	@ExceptionHandler({ PregnancyException.class })
	public void handleInvalidData(PregnancyException pex, HttpServletResponse response )
	{ 
		LOG.error("Invalid Data Exception is: ", pex);
		// return empty 406
	
	}
}
