package com.lognsys.babycare.core.stage;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaStageRepository implements StageRepository
{

	private EntityManager entityManager;

	private Properties properties;

	private static List<Stage> listOfStage;

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

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Stage> getAllStages()
	{
		if (listOfStage == null)
		{
			listOfStage = entityManager.createNativeQuery(properties.getProperty("SELECT_ALL_STAGES"), Stage.class)
					.getResultList();
		}

		return listOfStage;
	}

}
