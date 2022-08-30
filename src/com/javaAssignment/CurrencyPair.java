package com.javaAssignment;

import java.time.LocalDateTime;

public class CurrencyPair {
	private String currency1;
	private String currency2;
	private String spotDays;
	private String weekendDays;
	private Integer precision;
	private LocalDateTime lastUpdatedTime;
	public CurrencyPair(String currencyPair1, String currencyPair2, String spotDays, String weekendDays, Integer precision,
			LocalDateTime lastUpdatedTime) {
		super();
		this.currency1 = currencyPair1;
		this.currency2 = currencyPair2;
		this.spotDays = spotDays;
		this.weekendDays = weekendDays;
		this.precision = precision;
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public CurrencyPair() {
		super();
	}
	public String getCurrency1() {
		return currency1;
	}
	public void setCurrency1(String currencyPair1) {
		this.currency1 = currencyPair1;
	}
	public String getCurrency2() {
		return currency2;
	}
	public void setCurrency2(String currencyPair2) {
		this.currency2 = currencyPair2;
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
	public LocalDateTime getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	@Override
	public String toString() {
		return "CurrencyPair [currencyPair1=" + currency1 + ", currencyPair2=" + currency2 + ", spotDays="
				+ spotDays + ", weekendDays=" + weekendDays + ", precision=" + precision + ", lastUpdatedTime="
				+ lastUpdatedTime + "]";
	}
	
}
