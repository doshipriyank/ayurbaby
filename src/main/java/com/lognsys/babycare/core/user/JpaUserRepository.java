package com.lognsys.babycare.core.user;

import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lognsys.babycare.core.user.UserRepository;

public class JpaUserRepository implements UserRepository {

	Logger LOG = Logger.getLogger(getClass().getName());

	@PersistenceContext
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

	/**
	 * @param user
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public boolean saveOrUpdate(User user) {

		User savedUser = entityManager.find(User.class, user.getEmail());

		String primaryKey;

		if (savedUser == null) {
			entityManager.persist(user);
			entityManager.flush();
			primaryKey = user.getEmail();
			LOG.info("User value inserted by user - " + primaryKey);
		} else {
			user.setId(savedUser.getId());
			entityManager.merge(user);
			primaryKey = savedUser.getEmail();
			LOG.info("User profile updated by user - " + primaryKey);
		}
		return (!primaryKey.isEmpty() || primaryKey != null);

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

	@Override
	public User findUserById(int user_id) {
		return (User) entityManager.createNativeQuery(properties.getProperty("SELECT_USER"), User.class)
				.setParameter(1, user_id).getSingleResult();
	}

}
