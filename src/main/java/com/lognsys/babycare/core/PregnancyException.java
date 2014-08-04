package com.lognsys.babycare.core;

public class PregnancyException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PregnancyException()
	{
		// no-arg constructor
	}

	public PregnancyException(String message)
	{
		super(message);
	}
	
	public PregnancyException(Throwable cause)
	{
		super(cause);
	}
	
	public PregnancyException(String message, Throwable cause)
	{
		super(message, cause);
	}

}
