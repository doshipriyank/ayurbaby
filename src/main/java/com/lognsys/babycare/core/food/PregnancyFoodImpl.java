package com.lognsys.babycare.core.food;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.lognsys.babycare.core.food.PregnancyFoodRepository;

public class PregnancyFoodImpl implements PregnancyFood
{


	PregnancyFoodRepository pregFoodRepository;
	
	private List<Nutritional> listOfNutritionalFood = null;

	private List<Ayurvedic> listOfAyurvedicFood = null;

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

}
