package com.company.strategy3;

import java.math.BigDecimal;

public class ISS implements Tax {

	@Override
	public BigDecimal calculate(Budget budget) {
		return new BigDecimal("0.06");
	}
}
