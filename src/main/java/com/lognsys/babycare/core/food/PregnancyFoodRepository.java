package com.lognsys.babycare.core.food;

import java.util.List;


public interface PregnancyFoodRepository
{
	/**
	 * Returns List Nutritional
	 * 
	 * @param stage
	 * @return
	 */
	public List<Nutritional> findNutritionalFoodByStage(int stage);

	/**
	 * Returns List Ayurvedic
	 * 
	 * @param stage
	 * @return
	 */
	public List<Ayurvedic> findAyurvedicByStage(int stage);

}
