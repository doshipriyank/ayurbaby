package com.lognsys.babycare.loader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.lognsys.babycare.vo.AyurvedicVO;
import com.lognsys.babycare.vo.FunfactsVO;
import com.lognsys.babycare.vo.NutritionalVO;

public class Parser
{

	private static int noOfParsedNutFoodRow = 0;
	private static int noOfParsedAyurvedFoodRow = 0;
	private static int noOfParsedFunfactsRow = 0;
	
	/**
	 * Parse excel sheet nutritional skip first row which contains column name
	 * 
	 * @param nutritionalSheet
	 * @return list of NutrtionalVO object
	 */
	public List<NutritionalVO> parseNutritionalData(Sheet nutritionalSheet)
	{
		Iterator<Row> rowIterator = nutritionalSheet.iterator();
		List<NutritionalVO> listOfNutritionalVo = new ArrayList<NutritionalVO>();

		while (rowIterator.hasNext())
		{

			Row row = rowIterator.next();
			NutritionalVO nutVo = null;

			if (row.getRowNum() != 0)
			{

				nutVo = new NutritionalVO();

				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext())
				{

					Cell cell = cellIterator.next();

					if (cell.getColumnIndex() == 0)
						nutVo.setMonth(getCellValue(cell));
	
					if (cell.getColumnIndex() == 1)
						nutVo.setFood(getCellValue(cell));

					if (cell.getColumnIndex() == 2)
						nutVo.setPrepmethod(getCellValue(cell));

					if (cell.getColumnIndex() == 3)
						nutVo.setNutritionalValue(getCellValue(cell));

					if (cell.getColumnIndex() == 4)
						nutVo.setFoetus_dev(getCellValue(cell));

					if (cell.getColumnIndex() == 5)
						nutVo.setWarnings(getCellValue(cell));

					if (cell.getColumnIndex() == 6)
						nutVo.setFruits(getCellValue(cell));
				}

			}

			if (nutVo != null)
				listOfNutritionalVo.add(nutVo);

			noOfParsedNutFoodRow++;
		}

		return listOfNutritionalVo;

	}

	/**
	 * Parse excel sheet nutritional skip first row which contains column name
	 * 
	 * @param ayurvedSheet
	 * @return list of AyurvedicVO objects
	 */
	public List<AyurvedicVO> parseAyurvedData(Sheet ayurvedSheet)
	{
		Iterator<Row> rowIterator = ayurvedSheet.iterator();
		List<AyurvedicVO> listOfAyurvedicVo = new ArrayList<AyurvedicVO>();

		while (rowIterator.hasNext())
		{

			Row row = rowIterator.next();
			AyurvedicVO ayurVo = null;

			if (row.getRowNum() != 0)
			{
				ayurVo = new AyurvedicVO();

				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext())
				{
					Cell cell = cellIterator.next();

					if (cell.getColumnIndex() == 0)
						ayurVo.setMonth(getCellValue(cell));
	
					if (cell.getColumnIndex() == 1)
						ayurVo.setAyurvedic_med(getCellValue(cell));

					if (cell.getColumnIndex() == 2)
						ayurVo.setPrepmethod(getCellValue(cell));

					if (cell.getColumnIndex() == 3)
						ayurVo.setNutritional_value(getCellValue(cell));

					if (cell.getColumnIndex() == 4)
						ayurVo.setFoetus_dev(getCellValue(cell));

				}

			}

			if (ayurVo != null)
				listOfAyurvedicVo.add(ayurVo);

			noOfParsedAyurvedFoodRow++;
		}

		return listOfAyurvedicVo;
	}

	/**
	 * Assumptions: Code will only check for first column in the row funfacts sheet has only one column. Code checks for
	 * blank row after every Question and Answer TODO : Change algorithm to overcome assumptions.
	 * 
	 * @param funFactsSheet
	 */
	public List<FunfactsVO> parseFunFacts(Sheet funFactsSheet)
	{

		FunfactsVO funFacts = null;
		Iterator<Row> rowIterator = funFactsSheet.iterator();
		List<FunfactsVO> listOfFunFacts = new ArrayList<FunfactsVO>();

		int compound_id = 0;
		StringBuilder sb = null;

		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();

			// Assuming only cell 0 has data.
			Cell cell = row.getCell(0);

			// data
			String data = getCellValue(cell);
			
			String[] organicCompounds = IngestXLSData.getOrganicCompunds();

			for (int i = 0; i < organicCompounds.length; i++)
			{
				if (organicCompounds[i].equalsIgnoreCase(data))
				{
					compound_id = i;
					compound_id = compound_id + 1;
				}

			}

			if (data.trim().endsWith("?"))
			{
				funFacts = new FunfactsVO();
				funFacts.setCompound_id(compound_id);
				funFacts.setQuestion(data);

				sb = new StringBuilder();

			}

			if (!data.trim().endsWith("?"))
			{

				if (sb != null)
				{
					sb.append(data);

				}

			}

			if (data.isEmpty())
			{
				funFacts.setAnswer(sb.toString());
				listOfFunFacts.add(funFacts);
			}

			noOfParsedFunfactsRow++;
		}

		return listOfFunFacts;

	}

	/**
	 * @param cell
	 * @return String cell value
	 */
	public static String getCellValue(Cell cell)
	{
		String cellValue = "";

		switch (cell.getCellType())
		{
			case Cell.CELL_TYPE_BLANK:
				cellValue = cell.getStringCellValue();
				break;

			case Cell.CELL_TYPE_STRING:
				cellValue = cell.getStringCellValue();
				break;

			case Cell.CELL_TYPE_NUMERIC:
				Double val = cell.getNumericCellValue();
				cellValue = Integer.toString(val.intValue());
				break;
		}

		return cellValue;

	}
	
	public static List<String> getStats()
	{
		ArrayList<String> stats = new ArrayList<String>();
		
		if(noOfParsedFunfactsRow != 0)
			stats.add("Rows parsed Funfacts Sheet - "+noOfParsedFunfactsRow);
		
		if(noOfParsedAyurvedFoodRow!= 0)
			stats.add("Rows parsed Ayurved Sheet - "+noOfParsedAyurvedFoodRow);
		
		if(noOfParsedNutFoodRow != 0)
			stats.add("Rows parsed Nutritional Sheet - "+noOfParsedNutFoodRow);
		
			return stats;
	}

}
