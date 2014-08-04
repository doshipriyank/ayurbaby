package com.lognsys.babycare.core;


import com.lognsys.babycare.core.food.PregnancyFood;
import com.lognsys.babycare.core.funfacts.Compound;


public interface Pregnancy
{
	/**
	 * Returns NutritionalFood and Ayurvedic food by prgenancy Stage
	 * 
	 * @param stage
	 * @return
	 */
	public PregnancyFood recommendedPregnancyFood(int stage);

	/**
	 * Calculate due date based on last menstrual cycle(lmp)
	 * 
	 * @param lmpDate
	 * @return String representation of date
	 */
	public String calculateDueDate(String lmpDate);

	/**
	 * @param compound
	 * @return
	 */
	public Compound getNutrientsFacts(String nutrient);

	/**
	 * Get Pregnancy stage ibased on last Menstrual Cycle.
	 * 
	 * @param lmpDate
	 * @return returns stage as int 
	 */
	public int getPregnancyStage(String lmpDate);

}
