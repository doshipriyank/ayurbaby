package com.lognsys.babycare.core.food;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.food.Nutritional;
import com.lognsys.babycare.core.food.PregnancyFood;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
public class PregnancyFoodTest
{
	@Autowired
	PregnancyFood pregnancyFood;

	@Test
	public void testPregnancyFood()
	{
		int stage = 1;
		
		pregnancyFood.setPregnancyFood(stage);
		List<Ayurvedic> ayurList = pregnancyFood.getAyurvedicFood();
		Assert.assertNotNull(ayurList);
	
		List<Nutritional> nutList = pregnancyFood.getNutritionalFood();
		Assert.assertNotNull(nutList);
		
		int stage0 = 0;
		pregnancyFood.setPregnancyFood(stage0);
		List<Ayurvedic> ayurList0 = pregnancyFood.getAyurvedicFood();
		Assert.assertNull(ayurList0);
	
		List<Nutritional> nutList0 = pregnancyFood.getNutritionalFood();
		Assert.assertNull(nutList0);

		
		

	}
}
