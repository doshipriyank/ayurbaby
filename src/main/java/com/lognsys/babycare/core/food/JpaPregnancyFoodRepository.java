package com.lognsys.babycare.core.food;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaPregnancyFoodRepository implements PregnancyFoodRepository
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Nutritional> findNutritionalFoodByStage(int stage)
	{
		System.out.println(properties.getProperty("SELECT_NUTRITIONAL_BYSTAGE"));

		return (List<Nutritional>) entityManager.createQuery(properties.getProperty("SELECT_NUTRITIONAL_BYSTAGE"))
				.setParameter("stage", stage).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ayurvedic> findAyurvedicByStage(int stage)
	{

		return (List<Ayurvedic>) entityManager.createQuery(properties.getProperty("SELECT_AYURVED_BYSTAGE"))
				.setParameter("stage", stage).getResultList();
	}

}
