package com.company.strategy3;

import java.math.BigDecimal;

public class ApplicationTest {
	
	public static void main(String[] args) {
		Budget budget = new Budget(new BigDecimal("100"));
		CalculateOfTaxes calculateTaxes = new CalculateOfTaxes();
		
		
		System.out.println("ICMS: " + calculateTaxes.calculate(budget, new ICMS()));
		System.out.println("ISS: " + calculateTaxes.calculate(budget, new ISS()));
	}
}
