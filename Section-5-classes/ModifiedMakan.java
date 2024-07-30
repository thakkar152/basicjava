class ModifiedMakan{

	void bedRoom(){
	   System.out.println("Bed");
	   System.out.println("Fan");
	}   
		
	void kitchen(){
	   System.out.println("Gas");
	   System.out.println("Vessels");
	}
		
	void bathRoom(){
	   System.out.println("Tumbler");
	   System.out.println("Soap");
	}		
	
	public static void main(String[] args){
		
		ModifiedMakan obj = new ModifiedMakan();
		obj.bedRoom();
		obj.kitchen();
		obj.bathRoom();
	
	}	
}