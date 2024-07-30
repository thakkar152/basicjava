
public class ConcurrencyRunner {

	public static void main(String[] args) {
		
		Incrementer inc = new Incrementer();
		inc.incrementI();
		inc.incrementI();
		
		System.out.println(inc.getI());

	}

}
