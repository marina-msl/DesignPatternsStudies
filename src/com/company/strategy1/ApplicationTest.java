package com.company.strategy1;

import java.math.BigDecimal;

public class ApplicationTest {
	
	public static void main(String[] args) {
		
		Budget budget = new Budget(new BigDecimal("100"));
		CalculateTaxes calculate = new CalculateTaxes();
		
			System.out.println("ICMS :" + calculate.calculateTaxes(budget, TypeOfTaxes.ICMS));
			System.out.println("ISS :" + calculate.calculateTaxes(budget, TypeOfTaxes.ISS));
		}
}
