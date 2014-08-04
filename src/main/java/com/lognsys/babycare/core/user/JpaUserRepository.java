package com.lognsys.babycare.core.user;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.lognsys.babycare.core.stage.Stage;

public class JpaUserRepository implements UserRepository
{
	private EntityManager entityManager;

	private Properties properties;

	public Properties getProperties()
	{
		return properties;
	}

	public void setProperties(Properties properties)
	{
		this.properties = properties;
	}

	/**
	 * Set the entity manager. Assumes automatic dependency injection via the JPA @PersistenceContext annotation.
	 * However this method may still be called manually in a unit-test.
	 * 
	 * @param entityManager
	 */
	@PersistenceContext
	void setEntityManager(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}

	@Override
	public Stage findPregnancyStage(String username)
	{
		User user =  (User) entityManager.createNativeQuery(properties.getProperty("SELECT_USER_STAGE"), User.class)
				.setParameter(1, username).getSingleResult();
		
		return user.getStage();
	}

	@Override
	public User findUserById(int user_id)
	{
		return (User) entityManager.createNativeQuery(properties.getProperty("SELECT_USER"), User.class)
				.setParameter(1, user_id).getSingleResult();
	}

	@Override
	public void updateStage(String username)
	{
		//TODO update stage based on lmpdate
	}

}
