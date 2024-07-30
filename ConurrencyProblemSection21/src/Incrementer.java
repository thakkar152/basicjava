
public class Incrementer {

	private int i ;
	
	synchronized public void incrementI() {
		i++;
	}
	
	public int getI() {
		return this.i;
	}
}
