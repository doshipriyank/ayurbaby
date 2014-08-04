package com.lognsys.babycare.core.food;

import java.util.List;
import java.util.Map;


public interface PregnancyFood
{
	/**
	 * Returns map of pregnancy food i.e nutritional and ayurvedic food
	 * 
	 * @param stage
	 * @return
	 */
	public void setPregnancyFood(int stage);

	/**
	 * 
	 * @return list Nutritional
	 */
	public List<Nutritional> getNutritionalFood();
	
	/**
	 * 
	 * @return list Nutritional
	 */
	public List<Ayurvedic> getAyurvedicFood();
	

}
