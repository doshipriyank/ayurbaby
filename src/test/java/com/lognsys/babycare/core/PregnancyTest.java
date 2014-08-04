package com.lognsys.babycare.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.food.Nutritional;
import com.lognsys.babycare.core.food.Ayurvedic;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:system-test-config.xml" })
public class PregnancyTest
{
	private static final String DATE_FORMAT_INPUT = "ddMMyyyy";

	@Autowired
	Pregnancy pregnancy;

	@Test
	public void testRecommendedPregnancyFood()
	{
		List<Nutritional> listOfNut = pregnancy.recommendedPregnancyFood(1).getNutritionalFood();
		Assert.assertNotNull(listOfNut);
		
		List<Ayurvedic> listOfAyur = pregnancy.recommendedPregnancyFood(1).getAyurvedicFood();
		Assert.assertNotNull(listOfAyur);
		
		List<Nutritional> listOfNut0 = pregnancy.recommendedPregnancyFood(0).getNutritionalFood();
		Assert.assertNull(listOfNut0);
		//Assert.assertEquals("Empty nutritional list Test", new ArrayList<Nutritional>(), listOfNut0);
		
		List<Ayurvedic> listOfAyur0 = pregnancy.recommendedPregnancyFood(0).getAyurvedicFood();
		Assert.assertNull(listOfAyur0);
		//Assert.assertEquals("Empty nutritional list Test", new ArrayList<Ayurvedic>(), listOfAyur0);
		
		
		List<Nutritional> listOfNut2 = pregnancy.recommendedPregnancyFood(2).getNutritionalFood();
		Assert.assertNotNull(listOfNut2);
		
		List<Ayurvedic> listOfAyur2 = pregnancy.recommendedPregnancyFood(2).getAyurvedicFood();
		Assert.assertNotNull(listOfAyur2);
		
		List<Nutritional> listOfNutNegative = pregnancy.recommendedPregnancyFood(-1).getNutritionalFood();
		//Assert.assertEquals("Empty nutritional list Test", new ArrayList<Nutritional>(), listOfNutNegative);
		Assert.assertNull(listOfNutNegative);
		
		List<Ayurvedic> listOfAyurNegative = pregnancy.recommendedPregnancyFood(-1).getAyurvedicFood();
		//Assert.assertEquals("Empty nutritional list Test", new ArrayList<Ayurvedic>(), listOfAyurNegative);
		Assert.assertNull(listOfAyurNegative);
	}

	@Test
	public void testGetPregnancyStage()
	{
		String pregnancyDate = new DateTime().minusMonths(7).toString(DATE_FORMAT_INPUT);
		int stage = pregnancy.getPregnancyStage(pregnancyDate);
		assertEquals(7, stage);

		String pregnancyDate1 = new DateTime().toString(DATE_FORMAT_INPUT);
		int stage1 = pregnancy.getPregnancyStage(pregnancyDate1);
		assertEquals(1, stage1);

		String pregnancyDate2 = new DateTime().minusYears(1).toString(DATE_FORMAT_INPUT);
		int stage2 = pregnancy.getPregnancyStage(pregnancyDate2);
		assertEquals(0, stage2);

		String pregnancyDate3 = new DateTime().minusMonths(9).toString(DATE_FORMAT_INPUT);
		int stage3 = pregnancy.getPregnancyStage(pregnancyDate3);
		assertEquals(9, stage3);

	}
//
//	@Test
//	public void testGetNutrientFacts()
//	{
//		Compound listOfFats = pregnancy.getNutrientsFacts("fats");
//		Assert.assertNotNull(listOfFats);
//
//		List<Compound> listOfFolic = pregnancy.getNutrientsFacts("folic acid");
//		Assert.assertNotNull(listOfFolic);
//
//		List<Compound> listOfZinc = pregnancy.getNutrientsFacts("zinc");
//		Assert.assertNotNull(listOfZinc);
//
//		List<Compound> listOfCarb = pregnancy.getNutrientsFacts("carbohydrates");
//		Assert.assertNotNull(listOfCarb);
//
//		List<Compound> listOfCalcium = pregnancy.getNutrientsFacts("calcium");
//		Assert.assertNotNull(listOfCalcium);
//
//		List<Compound> listOfProt = pregnancy.getNutrientsFacts("proteins");
//		Assert.assertNotNull(listOfProt);
//
//		List<Compound> listOfVitC = pregnancy.getNutrientsFacts("vitamin c");
//		Assert.assertNotNull(listOfVitC);
//
//		List<Compound> listOfVitD = pregnancy.getNutrientsFacts("vitamin d");
//		Assert.assertNotNull(listOfVitD);
//
//		List<Compound> listOfVitB6 = pregnancy.getNutrientsFacts("vitamin b6");
//		Assert.assertNotNull(listOfVitB6);
//
//		List<Compound> listOfMang = pregnancy.getNutrientsFacts("managnese");
//		Assert.assertNotNull(listOfMang);
//
//		List<Compound> listOfIron = pregnancy.getNutrientsFacts("iron");
//		Assert.assertNotNull(listOfIron);
//
//		List<Compound> listOfMag = pregnancy.getNutrientsFacts("magnesium");
//		Assert.assertNotNull(listOfMag);
//
//		List<Compound> emptList = pregnancy.getNutrientsFacts("anonymous");
//		Assert.assertEquals(new ArrayList<Compound>(), emptList);
//	}
	
	@Test
	public void testCalculateDueDate()
	{
		assertNull(pregnancy.calculateDueDate("01012013"));
	}
}
