package com.lognsys.babycare.core.funfacts;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.funfacts.FunfactsRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
public class JpaFunfactsRepositoryTest
{

	@Autowired
	private FunfactsRepository funfactsRepository;

	@Test
	public void testAllFunFacts()
	{
		
	}

	@Test
	public void testFindFactsByCompound()
	{
		Assert.assertNotNull(funfactsRepository.findfactsByCompound("fats"));
		
		Compound compound = funfactsRepository.findfactsByCompound("fats");
	
			System.out.println("Test Compound - "+compound.getFacts());
		
		
		//Assert.assertTrue(funfactsRepository.findfactsByCompound("fats").size() > 1);

	}

}
