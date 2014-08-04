package com.lognsys.babycare.core.stage;

import java.util.List;


public interface StageRepository
{
	/**
	 * Returns stage obj based on week. Stage object is returned based on week parameter from the range of weeks and the
	 * stage obj which includes month is returned.
	 * 
	 * @param week
	 * @return
	 */
	//public Stage findStage(int week);

	/**
	 * Returns Stage obj based User stage_id
	 * 
	 * @param stage_id
	 * @return
	 */
	//public Stage findStage(User stage_id);
	
	/**
	 * Return all stages
	 * 
	 * @return
	 */
	public List<Stage> getAllStages();
	
 }
