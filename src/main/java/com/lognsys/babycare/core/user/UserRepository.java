package com.lognsys.babycare.core.user;

public interface UserRepository
{

//	public Stage findPregnancyStage(String username);
//
//	public void updateStage(String username);

	public User findUserById(int user_id);
	
	public boolean saveOrUpdate(User user);
	
}
