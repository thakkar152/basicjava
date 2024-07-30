package com.udemy.exceptionhandling;

class Amount {

	private String currency;
	private int value;

	public Amount(String currency, int value) {
		super();
		this.currency = currency;
		this.value = value;
	}

	public int add(Amount that) {

		if (!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies does not match");
		}
		return this.value = this.value + that.value;
	}

	public int addCheckedException(Amount that) throws Exception {

		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies does not match");
		}
		return this.value = this.value + that.value;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", value=" + value + "]";
	}

}

public class ThrowExceptionRunner {

	public static void main(String[] args) {

		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);

		// amount1.add(amount2);
		// System.out.println(amount1);

		try {
			amount1.addCheckedException(amount2);
			System.out.println(amount1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
