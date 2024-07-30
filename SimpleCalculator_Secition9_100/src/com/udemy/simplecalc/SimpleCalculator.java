package com.udemy.simplecalc;

import java.math.BigDecimal;

public class SimpleCalculator {

	String principal;
	String interest;

	public SimpleCalculator() {
		// TODO Auto-generated constructor stub
	}

	SimpleCalculator(String i, String j) {

		this.principal = i;
		this.interest = j;
	}

	public BigDecimal calculateTotalValue(int years) {

		// P*R*T/100 total interest and total interest + principal = total value.

		BigDecimal principal = new BigDecimal(this.principal);
		BigDecimal interest = new BigDecimal(this.interest);
		BigDecimal totalInterest = (principal.multiply(interest).multiply(new BigDecimal(years)))
				.divide(new BigDecimal(100));
		BigDecimal totalValue = totalInterest.add(principal);
		return totalValue;

	}
}
