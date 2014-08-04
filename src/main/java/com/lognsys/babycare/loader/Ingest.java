package com.lognsys.babycare.loader;

import java.io.FileNotFoundException;
import java.util.List;

public interface Ingest
{

	public void parseData() throws FileNotFoundException;

	public void loadData(List<?> listOfData, EXCELSHEETS loadTable);

	public void printReport();

	public int run();

}
