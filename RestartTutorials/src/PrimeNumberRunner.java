
public class PrimeNumberRunner {

	public static void main(String[] args) {

		int number = 31;
		boolean isPrime = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Number is not prime");
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		if (isPrime == true) {
			System.out.println("Number is prime");
		}

		byte b = Byte.SIZE;
		String s = "abc";
		s.length();
	}

}
