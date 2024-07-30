import java.math.BigDecimal;

public class SimpleCalculatorBigDecimal {

	BigDecimal number1;
	BigDecimal number2;

	SimpleCalculatorBigDecimal(String number1, String number2) {
		this.number1 = new BigDecimal(number1);
		this.number2 = new BigDecimal(number2);
	}

	BigDecimal add() {
		return this.number1.add(this.number2);
	}

	BigDecimal multiply() {
		return this.number1.multiply(this.number2);
	}

	public static void callingStatic() {
		System.out.println("This is static method calling from main static without object");
	}
}
