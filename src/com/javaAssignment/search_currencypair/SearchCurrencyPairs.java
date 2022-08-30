package com.javaAssignment.search_currencypair;

import java.util.ArrayList;

import com.javaAssignment.CurrencyPair;

public class SearchCurrencyPairs {
   public static ArrayList<CurrencyPair> searchPairs(String currency1,String currency2,ArrayList<CurrencyPair> list){
	  for(CurrencyPair element:list) {
		 if(currency1.equals(element.getCurrency1()) && currency2.equals(element.getCurrency2())) {
			 System.out.println(element);
		 }
	  }
	return list;
   }


}
