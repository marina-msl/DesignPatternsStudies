package com.company.strategy2;

import java.math.BigDecimal;

public class ApplicationTest {
	
	public static void main(String[] args) {
		
		Budget budget = new Budget(new BigDecimal("100"));
		CalculateTaxes calculateIcms = new CalculateICMS();
		CalculateTaxes calculateIss  = new CalculateISS();
		
		System.out.println(calculateIcms.calculateTaxes(budget));
		System.out.println(calculateIss.calculateTaxes(budget));
	}
}
