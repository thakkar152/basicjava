
public class BiIncrementer {

	private int i ;
	private int j;
	
	synchronized public void incrementI() {
		i++;
	}
	
	synchronized public void incrementJ() {
		j++;
	}
	
	public int getI() {
		return this.i;
	}
	
	public int getJ() {
		return this.j;
	}
}
