package com.company.strategy3;

import java.math.BigDecimal;

public class ICMS implements Tax{

	@Override
	public BigDecimal calculate(Budget budget) {
		return new BigDecimal("0.01");
	}

}
