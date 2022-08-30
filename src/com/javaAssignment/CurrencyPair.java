package com.javaAssignment;

import java.time.LocalDate;

public class CurrencyPair {
//	Ccy1,Ccy2,spotdays,WeekendDays,Precision,LastUpdatedTime
	private String currencyPair1;
	private String currencyPair2;
	private String spotDays;
	private String weekendDays;
	private Integer precision;
	private LocalDate lastUpdatedTime;
	public CurrencyPair(String currencyPair1, String currencyPair2, String spotDays, String weekendDays, Integer precision,
			LocalDate lastUpdatedTime) {
		super();
		this.currencyPair1 = currencyPair1;
		this.currencyPair2 = currencyPair2;
		this.spotDays = spotDays;
		this.weekendDays = weekendDays;
		this.precision = precision;
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public CurrencyPair() {
		super();
	}
	public String getCurrencyPair1() {
		return currencyPair1;
	}
	public void setCurrencyPair1(String currencyPair1) {
		this.currencyPair1 = currencyPair1;
	}
	public String getCurrencyPair2() {
		return currencyPair2;
	}
	public void setCurrencyPair2(String currencyPair2) {
		this.currencyPair2 = currencyPair2;
	}
	public String getSpotDays() {
		return spotDays;
	}
	public void setSpotDays(String spotDays) {
		this.spotDays = spotDays;
	}
	public String getWeekendDays() {
		return weekendDays;
	}
	public void setWeekendDays(String weekendDays) {
		this.weekendDays = weekendDays;
	}
	public Integer getPrecision() {
		return precision;
	}
	public void setPrecision(Integer i) {
		this.precision = i;
	}
	public LocalDate getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(LocalDate lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	@Override
	public String toString() {
		return "CurrencyPair [currencyPair1=" + currencyPair1 + ", currencyPair2=" + currencyPair2 + ", spotDays="
				+ spotDays + ", weekendDays=" + weekendDays + ", precision=" + precision + ", lastUpdatedTime="
				+ lastUpdatedTime + "]";
	}
	
}
