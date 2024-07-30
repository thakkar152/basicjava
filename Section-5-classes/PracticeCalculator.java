class PracticeCalculator{
	
	int sum(int a,int b){
		return a+b;
	}
	int minus(int b,int a){
		return b-a;
	}
	int multiply(int a, int b){
		return a*b;
	}
	
	public static void main(String[] args){
		PracticeCalculator pc = new PracticeCalculator();
		System.out.println(pc.sum(10,15));
		System.out.println(pc.minus(15,10));
		System.out.println(pc.multiply(10,15));
	}
}