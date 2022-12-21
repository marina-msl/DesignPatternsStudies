package com.company.strategy2;

import java.math.BigDecimal;

public class Budget {
	
	private BigDecimal value;
	
	public Budget(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimal getValue() {
		return value;
	}
}
