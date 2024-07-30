package com.udemy.nestedclass;

//this is just a class with default access modifier which can be accessed throughout package. 

class DefaultClass{
	
}

public class NestedClassRunner {

	private int i;
	
	class InnerClass{
		
		void innerClassMethod(){
			i = 5;
 		}
		
	}
	
	static class StaticNestedClass {
		
		void staticNestedClassMethod() {
			
		}
		
	}

	
	public static void main (String[] args) {
	
		/* Below throws an error
		 * No enclosing instance of type NestedClassRunner is accessible. 
		 * Must qualify the allocation with an enclosing instance of type NestedClassRunner 
		 * (e.g. x.new A() where x is an instance of NestedClassRunner). 
		 */
		
		//InnerClass ic = new InnerClass();
	
		NestedClassRunner ns = new NestedClassRunner();
		InnerClass ic = ns.new InnerClass();
		ic.innerClassMethod();
		
		StaticNestedClass staticNestedClass = new StaticNestedClass();
		staticNestedClass.staticNestedClassMethod();
		
	}
}
