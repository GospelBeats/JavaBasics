package javaBasics;

public class Scope {
	
	//x is declared outside of any method, it is in scope to all methods
	static int x; //class variable
	
	
	public static void main(String[] args) {
		
	x = 5;
	System.out.println(x);
	
	doSomething();
	System.out.println(x);	
	
	}
	
	static void doSomething(){
	x = 10;
	}
	
	static void doSomethingLocally(){
	//y is local inside this method
	int y = 100;
	}

}
