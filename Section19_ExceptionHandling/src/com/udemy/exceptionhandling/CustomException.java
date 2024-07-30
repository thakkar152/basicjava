package com.udemy.exceptionhandling;

class CustomAmount {

	private String currency;
	private int value;

	public CustomAmount(String currency, int value) {
		super();
		this.currency = currency;
		this.value = value;
	}

	public int add(CustomAmount that) throws CurrencyDoNotMatchException {

		if (!this.currency.equals(that.currency)) {
			throw new CurrencyDoNotMatchException("Currencies does not match");
		}
		return this.value = this.value + that.value;
	}

	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", value=" + value + "]";
	}

}

class CurrencyDoNotMatchException extends Exception {

	public CurrencyDoNotMatchException(String msg) {
		super(msg);
	}
}

public class CustomException {

	public static void main(String[] args) {

		CustomAmount amount1 = new CustomAmount("USD", 10);
		CustomAmount amount2 = new CustomAmount("EUR", 20);

		// amount1.add(amount2);
		// System.out.println(amount1);

		try {
			amount1.add(amount2);
			System.out.println(amount1);
		} catch (CurrencyDoNotMatchException e) {
			e.printStackTrace();
		}

	}

}
