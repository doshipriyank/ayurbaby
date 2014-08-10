package com.lognsys.babycare.core.food;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
@ActiveProfiles("dev")
public class JpaPregnancyFoodTest
{
	@Autowired
	private PregnancyFoodRepository pregFoodRepository;

	@Test
	public void testAyurvedicFood()
	{
		int stage1 = 1;
		List<Ayurvedic> ayurList1 = pregFoodRepository.findAyurvedicByStage(stage1);
		Assert.assertNotNull(ayurList1);
	

		int stage2 = 0;
		List<Ayurvedic> ayurList2 = pregFoodRepository.findAyurvedicByStage(stage2);
		Assert.assertEquals("Empty ayurvedic list Test", new ArrayList<Ayurvedic>(), ayurList2);
		//Assert.assertNull(ayurList2);

	}

	@Test
	public void testNutritionalFood()
	{
		int stage = 1;
		List<Nutritional> nutritionalList = pregFoodRepository.findNutritionalFoodByStage(stage);
		Assert.assertNotNull(nutritionalList);
	
		int stage2 = 0;
		List<Nutritional> nutritionalList2 = pregFoodRepository.findNutritionalFoodByStage(stage2);
		Assert.assertEquals("Empty nutritional list Test", new ArrayList<Nutritional>(), nutritionalList2);
		//Assert.assertNull(nutritionalList2);

	}
}
