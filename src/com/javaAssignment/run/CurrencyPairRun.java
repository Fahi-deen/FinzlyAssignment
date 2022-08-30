package com.javaAssignment.run;

import java.io.IOException;
import java.util.Scanner;

import com.javaAssignment.CurrencyPairDatafetcher;
import com.javaAssignment.lastUpdatedTime.LastUpdatedTime;
import com.javaAssignment.search_currencypair.SearchCurrencyPairs;
import com.javaAssignment.sort_currency_pairs.SortCurrencyPairs;

public class CurrencyPairRun {
    public static void main(String[] args) {
    	 CurrencyPairDatafetcher currencyPairData=new CurrencyPairDatafetcher();
    	 Scanner scanner=new Scanner(System.in);
    	 System.out.println("Choose Your Option.\n" + "1.To search the pairs\n" + "2.To sort the Currency Pairs"
 				+ "\n3.To know last UpdatedTime\n" + "4.Exit");
    	 boolean exit=false;
    	 int choice;
    	 while(exit !=true) {
    		 choice =scanner.nextInt();
    	 switch(choice) {
    		 case 1:
    			 System.out.println("Enter Currency 1:");
    			 String currency1=scanner.next().toUpperCase();
    			 System.out.println("Enter Currency 2:");
    			 String currency2=scanner.next().toUpperCase();
    			 SearchCurrencyPairs.searchPairs(currency1,currency2,CurrencyPairDatafetcher.list);
    			 break;
    		 case 2:
    			 System.out.println("Results of Sorted order by currency1+currency2:");
    			 SortCurrencyPairs.sortPairs(CurrencyPairDatafetcher.list);
    			 break;
    		 case 3:
    			 System.out.println("Results of Sorted order by lastUpdatedTime:");
    			 LastUpdatedTime.lastUpdatedTime(CurrencyPairDatafetcher.list);
    			 break;
    		 case 4:
    			 exit =true;
    			 break;
    			 
    		 default:
    			 System.out.println("Invalid Choice Try again...");
    			 break;
    	 }}
	scanner.close();
    }
        
}
