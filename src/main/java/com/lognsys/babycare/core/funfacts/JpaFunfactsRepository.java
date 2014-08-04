package com.lognsys.babycare.core.funfacts;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class JpaFunfactsRepository implements FunfactsRepository
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
	

	/**
	 * Returns all the facts and answer from the database
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Facts> getAllFacts()
	{
		return entityManager.createNativeQuery(properties.getProperty("SELECT_ALL_FUNFACTS"), Facts.class).getResultList();
	}

	
	/**
	 * 
	 */
	@Override
	public Compound findfactsByCompound(String compound)
	{
		return  (Compound) entityManager.createQuery(properties.getProperty("SELECT_COMPOUND_FACTS"), Compound.class).setParameter("compound", compound.trim()).getSingleResult();
	}


}
