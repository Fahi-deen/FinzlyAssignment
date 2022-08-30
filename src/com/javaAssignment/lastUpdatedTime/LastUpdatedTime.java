package com.javaAssignment.lastUpdatedTime;

import java.util.ArrayList;
import java.util.Collections;

import com.javaAssignment.CurrencyPair;
import com.javaAssignment.CurrencyPairDatafetcher;

public class LastUpdatedTime {
        public static void lastUpdatedTime(ArrayList<CurrencyPair> list) {
        	Collections.sort(list,(o1,o2)->o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime()));
        	CurrencyPairDatafetcher.display(list);
        }
}
