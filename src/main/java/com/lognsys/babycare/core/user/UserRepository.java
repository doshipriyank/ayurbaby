package com.lognsys.babycare.core.user;

public interface UserRepository {

	public User findUserById(int user_id);

	public boolean saveOrUpdate(User user);

	public User updateDeviceRegistration(User user);

}
