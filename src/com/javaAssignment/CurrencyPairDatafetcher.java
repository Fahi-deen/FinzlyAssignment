package com.javaAssignment;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import com.opencsv.CSVReader;

public class CurrencyPairDatafetcher {
	
	public static  ArrayList<CurrencyPair> list=new ArrayList<>();
	
	public void datafetcher(){
	try {
		
        FileReader filereader = new FileReader("src\\CurrencyPairs.csv");
        CSVReader csvReader = new CSVReader(filereader);
        String[] nextRecord;
        csvReader.readNext();
        while ((nextRecord = csvReader.readNext()) != null) {
            CurrencyPair currencyPair_obj=new CurrencyPair();
                  currencyPair_obj.setCurrency1(nextRecord[0]);
                  currencyPair_obj.setCurrency2(nextRecord[1]);
                  currencyPair_obj.setSpotDays(nextRecord[2]);
                  currencyPair_obj.setWeekendDays(nextRecord[3]);
                  currencyPair_obj.setPrecision(Integer.parseInt(nextRecord[4]));
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a",Locale.US);
                  LocalDateTime localDate = LocalDateTime.parse(nextRecord[5], formatter);
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
