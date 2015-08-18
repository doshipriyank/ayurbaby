package com.lognsys.babycare.core.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lognsys.babycare.core.stage.Stage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
@ActiveProfiles("dev")
public class JpaUserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testGetUser() {

		User user = userRepository.findUserById(2);
		Assert.assertNotNull(user);
	}

//	@Test
//	public void testPreganancyStage() {
//
//		Stage stage = userRepository.findPregnancyStage("pdoshi@yahoo.com");
//		Assert.assertNotNull(stage);
//	}

	@Test
	public void insertUser() {
		User user = new User();
		user.setAuth_id("123456789");
		user.setBirthDate("01/01/2014");
		user.setDueDate("23rd May");
		user.setEmail("pdoshi@ucop.edu");
		user.setFirstName("Priyank");
		user.setLastName("Doshi");
		user.setLastMenPeriod("01/10/2014");
		user.setLocation("Fremont");
		user.setNotification(true);
		user.setPhone("408-667-3786");
		userRepository.addUser(user);
	}

}
