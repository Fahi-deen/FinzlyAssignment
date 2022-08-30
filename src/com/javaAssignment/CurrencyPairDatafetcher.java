package com.javaAssignment;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class CurrencyPairDatafetcher {
	
	public static  ArrayList<CurrencyPair> list=new ArrayList<>();
	
	public CurrencyPairDatafetcher(){
	try {
		
        FileReader filereader = new FileReader("src\\CurrencyPairs.csv");
        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
        csvReader.readNext();
        while ((nextRecord = csvReader.readNext()) != null) {
            CurrencyPair currencyPair_obj=new CurrencyPair();
                  currencyPair_obj.setCurrencyPair1(nextRecord[0]);
                  currencyPair_obj.setCurrencyPair2(nextRecord[1]);
                  currencyPair_obj.setSpotDays(nextRecord[2]);
                  currencyPair_obj.setWeekendDays(nextRecord[3]);
                  currencyPair_obj.setPrecision((int)Float.parseFloat(nextRecord[4]));
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				  LocalDate localDate = LocalDate.parse(nextRecord[5], formatter);
                  currencyPair_obj.setLastUpdatedTime(localDate);
                  list.add(currencyPair_obj);
            }
            csvReader.close();
        }
    catch (Exception e) {
        e.printStackTrace();
    }
	}
	public static void display(ArrayList<CurrencyPair> list){
		for(CurrencyPair curr:list) {
			System.out.println(curr);
		}
	}
}
