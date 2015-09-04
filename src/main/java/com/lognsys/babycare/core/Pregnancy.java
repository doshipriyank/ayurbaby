package com.lognsys.babycare.core;


import java.util.List;

import com.lognsys.babycare.core.food.PregnancyFood;
import com.lognsys.babycare.core.funfacts.Compound;
import com.lognsys.babycare.core.user.User;


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
	 * @throws PregnancyException 
	 */
	public String calculateDueDate(String lmpDate) throws PregnancyException;

	/**
	 * @param Nutrients
	 * @return
	 */
	public Compound getNutrientsFacts(String nutrient);

	/**
	 * Get Pregnancy stage based on last Menstrual Cycle.
	 * 
	 * @param lmpDate
	 * @return returns stage as int 
	 * @throws PregnancyException 
	 */
	public int getPregnancyStage(String lmpDate) throws PregnancyException;
	
	/**
	 * Get Pregnancy week based on last Menstrual Cycle.
	 * 
	 * @param lmpDate
	 * @return returns week as int 
	 * @throws PregnancyException 
	 */
	public int getPregnancyWeek(String lmpDate) throws PregnancyException;
	
	
	
	/**
	 * Returns all compounds
	 * @return 
	 */
	public List<Compound> getCompounds();
	
	/**
	 * 
	 */
	public boolean saveOrUpdateUser(User user);
	
	/**
	 * 
	 */
	public void registerDevice(User user);

}
