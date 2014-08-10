package com.lognsys.babycare.core.funfacts;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.funfacts.FunfactsRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
@ActiveProfiles("dev")
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
		Assert.assertNull(funfactsRepository.findfactsByCompound(" "));
		Assert.assertNull(funfactsRepository.findfactsByCompound("anonymous"));
		Assert.assertNull(funfactsRepository.findfactsByCompound("%"));
	}

}
