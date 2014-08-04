package com.lognsys.babycare.util;

import java.util.StringTokenizer;

public class Util
{

	public static int[] normalizeMonths(String months, String delim)
	{

		if (months.startsWith(",") || months.endsWith(","))
			throw new IllegalArgumentException("Illegal parameter found - " + months + "\n"
					+ "Month cannot be normailzed");

		if (months.trim().length() == 1)
		{
			int val = Integer.parseInt(months.trim());
			int[] arr = new int[1];
			arr[0] = val;
			return arr;

		}

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
