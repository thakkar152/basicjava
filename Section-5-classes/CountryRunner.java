class CountryRunner{

	public static void main(String[] args){
		System.out.println("This is main method");
		Country c = new Country();	
		c.anotherFunction();
	}

}

class Country {

	public void anotherFunction(){
		System.out.println("This is function");
	}


}
