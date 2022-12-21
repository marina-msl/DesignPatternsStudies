package com.company.strategy1;

import java.math.BigDecimal;

public class CalculateTaxes {
	
	public BigDecimal calculateTaxes(Budget value, TypeOfTaxes typeOfTaxes) {
		
		switch (typeOfTaxes) {
		case ICMS: {
			return value.getValue().multiply(new BigDecimal("0.1"));
		}
		case ISS: {
			return value.getValue().multiply(new BigDecimal("0.06"));
		}
		default:
			return BigDecimal.ZERO;
		}
	}
}
