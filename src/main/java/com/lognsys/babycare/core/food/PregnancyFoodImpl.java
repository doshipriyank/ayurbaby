package com.lognsys.babycare.core.food;

import java.util.List;
import com.lognsys.babycare.core.food.PregnancyFoodRepository;

public class PregnancyFoodImpl implements PregnancyFood
{


	PregnancyFoodRepository pregFoodRepository;
	
	private List<Nutritional> listOfNutritionalFood = null;

	private List<Ayurvedic> listOfAyurvedicFood = null;
	
	private List<Recipes> listOfRecipes = null;

	public PregnancyFoodImpl(PregnancyFoodRepository pregFoodRepository)
	{
		this.pregFoodRepository = pregFoodRepository;

	}


	/**
	 * @return
	 */
	@Override
	public void setPregnancyFood(int stage)
	{
		
		listOfAyurvedicFood = pregFoodRepository.findAyurvedicByStage(stage);
		
		if(listOfAyurvedicFood.isEmpty())
			listOfAyurvedicFood = null;
		
		listOfNutritionalFood = pregFoodRepository.findNutritionalFoodByStage(stage);
		
		if(listOfNutritionalFood.isEmpty())
			listOfNutritionalFood = null;
		
		listOfRecipes = pregFoodRepository.findRecipesByStage(stage);
		
		if(listOfRecipes.isEmpty())
			listOfRecipes = null;
		

	}

	@Override
	public List<Nutritional> getNutritionalFood()
	{
		
		return this.listOfNutritionalFood;
	}


	@Override
	public List<Ayurvedic> getAyurvedicFood()
	{
		return this.listOfAyurvedicFood;
	}


	@Override
	public List<Recipes> getRecipes() {
		// TODO Auto-generated method stub
		return this.listOfRecipes;
	}

}
