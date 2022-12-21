package com.company.strategy1;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value;

	public Budget(BigDecimal value) {
		if(value == null) {
			throw new NullPointerException("Value cannot be null");
		}
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}
}
