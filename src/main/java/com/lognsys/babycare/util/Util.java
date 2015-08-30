package com.lognsys.babycare.util;

import java.util.StringTokenizer;

public class Util
{

	/**
	 * convert string delimited month to month[] eg: "1,2,3" = month = {1,2,3} 
	 * 
	 * @param months
	 * @param delim
	 * @return
	 */
	public static int[] normalizeMonths(String months, String delim)
	{

		if (months.startsWith(",") || months.endsWith(","))
			throw new IllegalArgumentException("Illegal parameter found - " + months + "\n"
					+ "Month cannot be normailzed");

		//if value = 1 than return ar[0] = 1
		if (months.trim().length() == 1)
		{
			int val = Integer.parseInt(months.trim());
			int[] arr = new int[1];
			arr[0] = val;
			return arr;

		}

		//break using string tokenizer of month (1,2,3) = month[] ->{1,2,3}
		StringTokenizer str = new StringTokenizer(months, delim);
		int[] monthArr = new int[str.countTokens()];

		int i = 0;
		while (str.hasMoreElements())
		{
			monthArr[i] = Integer.parseInt(str.nextToken().trim());
			i++;
		}

		return monthArr;

	}


}
