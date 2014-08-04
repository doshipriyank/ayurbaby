package com.lognsys.babycare.core.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lognsys.babycare.core.stage.Stage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
public class JpaUserRepositoryTest
{
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testGetUser()
	{

		User user = userRepository.findUserById(2);
		Assert.assertNotNull(user);
	}

	@Test
	public void testPreganancyStage()
	{

		Stage stage = userRepository.findPregnancyStage("pdoshi@yahoo.com");
		Assert.assertNotNull(stage);
	}

}
