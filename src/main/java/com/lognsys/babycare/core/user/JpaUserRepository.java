package com.lognsys.babycare.core.user;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lognsys.babycare.core.stage.Stage;
import com.lognsys.babycare.core.user.UserRepository;

public class JpaUserRepository implements UserRepository {
	private EntityManager entityManager;

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * Set the entity manager. Assumes automatic dependency injection via the
	 * JPA @PersistenceContext annotation. However this method may still be
	 * called manually in a unit-test.
	 * 
	 * @param entityManager
	 */
	@PersistenceContext
	void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public User findUserById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void addUser(User user) 
	{
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.clear();
	}

	// @Override
	// public Stage findPregnancyStage(String username)
	// {
	// User user = (User)
	// entityManager.createNativeQuery(properties.getProperty("SELECT_USER_STAGE"),
	// User.class)
	// .setParameter(1, username).getSingleResult();
	//
	// return user.getStage();
	// }
	//
	// @Override
	// public User findUserById(int user_id)
	// {
	// return (User)
	// entityManager.createNativeQuery(properties.getProperty("SELECT_USER"),
	// User.class)
	// .setParameter(1, user_id).getSingleResult();
	// }
	//
	// @Override
	// public void updateStage(String username)
	// {
	// //TODO update stage based on lmpdate
	// }

}
