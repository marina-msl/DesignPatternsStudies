package com.company.strategy2;

import java.math.BigDecimal;

public class CalculateICMS implements CalculateTaxes {
	
	
	public BigDecimal calculateTaxes(Budget value) {
			return value.getValue().multiply(new BigDecimal("0.10"));
		}
}
