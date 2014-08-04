package com.lognsys.babycare.rest.controller;

import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.joda.time.IllegalFieldValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lognsys.babycare.core.Pregnancy;
import com.lognsys.babycare.core.food.Nutritional;
import com.lognsys.babycare.core.food.Ayurvedic;
import com.lognsys.babycare.core.funfacts.Compound;
import com.lognsys.babycare.core.PregnancyException;

@Controller
@RequestMapping("/pregnancy")
public class PregnancyController
{

	private final Logger LOG = Logger.getLogger(getClass());

	@Autowired
	private Pregnancy pregnancy;

	@RequestMapping(value = "/compounds/{nutrient}", method = RequestMethod.GET)
	public @ResponseBody
	Compound getCompoundFacts(@PathVariable("nutrient") String nutrient)
	{
		return pregnancy.getNutrientsFacts(nutrient);
	}

	@RequestMapping(value = "/duedate/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	String pregnancyDueDate(@PathVariable("lmpDate") String lmpDate)
	{
		return pregnancy.calculateDueDate(lmpDate);
	}

	@RequestMapping(value = "/stage/{lmpDate}", method = RequestMethod.GET)
	public @ResponseBody
	int pregnancyStage(@PathVariable("lmpDate") String lmpDate)
	{
		return pregnancy.getPregnancyStage(lmpDate);
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
	@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
	@ExceptionHandler({ EmptyResultDataAccessException.class, NoResultException.class })
	public void handleNotFound(Exception ex)
	{
		LOG.error("Exception is: ", ex);
		// return empty 404
	}

	/**
	 * Maps IllegalArgumentExceptions to a 400 Bad Request HTTP status code.
	 */
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	@ExceptionHandler({ IllegalArgumentException.class, IllegalFieldValueException.class })
	public void handleBadData(Exception ex)
	{
		LOG.error("Exception is: ", ex);
		// return empty 400
	}
	
	@ResponseStatus(org.springframework.http.HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler({ PregnancyException.class })
	public void handleInvalidData(Exception ex)
	{ 
		LOG.error("Exception is: ", ex);
		// return empty 400
	}
}
