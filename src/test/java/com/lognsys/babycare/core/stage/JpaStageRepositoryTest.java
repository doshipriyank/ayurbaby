package com.lognsys.babycare.core.stage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.stage.StageRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
public class JpaStageRepositoryTest
{
	@Autowired
	StageRepository stageRepository;
	
	@Test
	public void testGetAllStages()
	{
		Assert.assertNotNull(stageRepository.getAllStages());
		Assert.assertEquals("List Stage size - ",9, stageRepository.getAllStages().size());
	}

}
