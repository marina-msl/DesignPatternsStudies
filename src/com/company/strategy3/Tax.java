package com.company.strategy3;

import java.math.BigDecimal;

public interface Tax {
	
	public BigDecimal calculate(Budget budget);
	
}
