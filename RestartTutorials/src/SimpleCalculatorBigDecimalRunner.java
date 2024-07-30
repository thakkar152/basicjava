import java.util.Scanner;

public class SimpleCalculatorBigDecimalRunner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		String number1 = scanner.next();
		System.out.println("Enter second number :");
		String number2 = scanner.next();
		SimpleCalculatorBigDecimal sc = new SimpleCalculatorBigDecimal(number1, number2);
		System.out.println(sc.add());
		System.out.println(sc.multiply());

		SimpleCalculatorBigDecimal.callingStatic();
	}

}
