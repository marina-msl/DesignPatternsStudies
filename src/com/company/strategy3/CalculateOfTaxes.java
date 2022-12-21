package com.company.strategy3;

import java.math.BigDecimal;

public class CalculateOfTaxes {
	
	public BigDecimal calculate(Budget value, Tax tax) {
		return tax.calculate(value);
	}
	
}
