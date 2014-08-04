package com.lognsys.babycare.core.user;

import com.lognsys.babycare.core.stage.Stage;

public interface UserRepository
{

	public Stage findPregnancyStage(String username);

	public void updateStage(String username);

	public User findUserById(int user_id);

}
