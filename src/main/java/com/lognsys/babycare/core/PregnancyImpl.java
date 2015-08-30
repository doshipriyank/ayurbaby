package com.lognsys.babycare.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lognsys.babycare.core.common.PregnancyUtil;
import com.lognsys.babycare.core.food.PregnancyFood;
import com.lognsys.babycare.core.funfacts.Compound;
import com.lognsys.babycare.core.funfacts.FunfactsRepository;
import com.lognsys.babycare.core.stage.Stage;
import com.lognsys.babycare.core.stage.StageRepository;
import com.lognsys.babycare.core.user.User;
import com.lognsys.babycare.core.user.UserRepository;

public class PregnancyImpl implements Pregnancy {

	@Autowired
	private PregnancyFood pregnancyFood;

	private StageRepository stageRepository;

	private FunfactsRepository funFactsRepository;

	private UserRepository userRepository;

	private static List<Stage> listOfStages;

	public PregnancyImpl(StageRepository stageRepository, FunfactsRepository funFactsRepository,
			UserRepository userRepository) {
		this.stageRepository = stageRepository;
		this.funFactsRepository = funFactsRepository;
		this.userRepository = userRepository;
	}

	@Override
	public PregnancyFood recommendedPregnancyFood(int stage) {
		pregnancyFood.setPregnancyFood(stage);
		return pregnancyFood;

	}

	@Override
	public String calculateDueDate(String lmpDate) throws PregnancyException {
		String pregnancyDate = null;

		pregnancyDate = PregnancyUtil.calculateDueDate(lmpDate);

		return pregnancyDate;
	}

	@Override
	public Compound getNutrientsFacts(String nutrient) {

		return this.funFactsRepository.findfactsByCompound(nutrient);
	}

	@Override
	public List<Compound> getCompounds() {
		return this.funFactsRepository.getAllCompounds();
	}

	@Override
	public int getPregnancyStage(String lmpDate) throws PregnancyException {
		int totalPegnancyWeek = 0;

		List<String> weeks = new ArrayList<String>();

		for (Stage stage : getCachedStages()) {
			weeks.add(stage.getWeek());
		}

		totalPegnancyWeek = PregnancyUtil.normalizePregnancyStage(weeks, lmpDate);

		return totalPegnancyWeek;
	}

	/**
	 * return list of all the stages from database
	 * 
	 * @return list of Stage
	 */
	private List<Stage> getCachedStages() {
		if (listOfStages == null)
			listOfStages = this.stageRepository.getAllStages();

		return listOfStages;
	}

	@Override
	public int getPregnancyWeek(String lmpDate) throws PregnancyException {
		return PregnancyUtil.getWeek(lmpDate);
	}


	@Override
	public void saveOrUpdateUser(User user) {
		 this.userRepository.saveOrUpdate(user);
	}

}
