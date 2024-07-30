
public class ProjectRunner {
	public static void main(String[] args) {
		System.out.println("This is eclipse");
		SomeNewClassWithInFileNameClass.printThis();
		
		SomeNewClassWithInFileNameClass sn = new SomeNewClassWithInFileNameClass();
		sn.printThis();
	}

	private static class SomeNewClassWithInFileNameClass {
		
		static void printThis() {
			System.out.println("Print This");
		}
		
		
		
	}
}


