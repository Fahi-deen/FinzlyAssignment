package com.javaAssignment.sort_currency_pairs;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.builder.CompareToBuilder;

import com.javaAssignment.CurrencyPair;
import com.javaAssignment.CurrencyPairDatafetcher;

public class SortCurrencyPairs {
	public static void sortPairs(ArrayList<CurrencyPair> list){
		  Collections.sort(list,(o1,o2)->(o1.getCurrencyPair1()+o1.getCurrencyPair2()).compareTo(o2.getCurrencyPair1()+o2.getCurrencyPair2()));
		 CurrencyPairDatafetcher.display(list);
	 
}
}