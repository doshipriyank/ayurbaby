package com.lognsys.babycare.core.funfacts;

import java.util.List;

public interface FunfactsRepository
{

	/**
	 * @return returns all funfacts
	 */
	public List<Facts> getAllFacts();

	/**
	 * @param compound
	 * @return returns all compounds and facts associated.
	 */
	public Compound findfactsByCompound(String compound);

}
