package com.lognsys.babycare.core.user;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lognsys.babycare.core.user.User;
import com.lognsys.babycare.core.user.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:system-test-config.xml")
@ActiveProfiles("dev")
public class JpaUserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	//@Test
	public void testGetUser() {

		User user = userRepository.findUserById(2);
		Assert.assertNotNull(user);
	}


	@Test
	public void testSaveOrUpdateUser() {
		User user = new User();
		user.setAuth_id("123456789");
		user.setBirthdate("01/01/2014");
		user.setDuedate("23rd May");
		user.setEmail("pdoshi@ucop.edu");
		user.setFirstname("Priyank");
		user.setLastname("Doshi");
		user.setLastmenperiod("01/10/2014");
		user.setLocation("Fremont");
		user.setProvenance("facebook");
		user.setNotification(true);
		user.setPhone("408-667-3786");
		user.setStage(2);
		boolean isSave = userRepository.saveOrUpdate(user);
		Assert.assertTrue("Save User - ", isSave);

		User userUpdate = new User();
		userUpdate.setAuth_id("134567892");
		userUpdate.setBirthdate("01/01/2014");
		userUpdate.setDuedate("3rd June");
		userUpdate.setEmail("pdoshi@ucop.edu");
		userUpdate.setFirstname("Priyank");
		userUpdate.setLastname("Doshi");
		userUpdate.setLastmenperiod("01/02/2015");
		userUpdate.setLocation("Fremont");
		userUpdate.setNotification(false);
		userUpdate.setStage(5);
		userUpdate.setProvenance("google");
		userUpdate.setPhone("408-667-3786");
		boolean isUpdate = userRepository.saveOrUpdate(userUpdate);
		Assert.assertTrue("Update User - ", isUpdate);
		
		
		User userUpdate2 = new User();
		userUpdate2.setAuth_id("156789234");
		userUpdate2.setBirthdate("01/01/2014");
		userUpdate2.setDuedate("10 December");
		userUpdate2.setEmail("pdoshi@ucop.edu");
		userUpdate2.setFirstname("Priyank");
		userUpdate2.setLastname("Doshi");
		userUpdate2.setLastmenperiod("12/12/2015");
		userUpdate2.setLocation("Fremont");
		userUpdate2.setNotification(true);
		userUpdate2.setStage(1);
		userUpdate2.setProvenance("twitter");
		userUpdate2.setPhone("408-667-3786");
		boolean isUpdate2 = userRepository.saveOrUpdate(userUpdate2);
		Assert.assertTrue("Update User - ", isUpdate2);
	}

}
