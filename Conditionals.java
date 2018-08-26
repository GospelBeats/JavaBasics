package javaBasics;

public class Conditionals {
	
	public static void main(String[] args) {
		
	// if (some expression that evaluate to true)
	// do something
		
	boolean sayHey = true;	
	
	boolean sayHello = false;
	//boolean sayGoodbye = false;
	
	//only first statement get evaluated
	if (sayHello){
		System.out.println("Hello");
		} 
	else if (sayHey){
		System.out.println("Hey");
	}	
	else {	
		System.out.println("Goodbye");
	}
	// <   >   <=   >=   !=   ==   &&   ||
	
	int playerX = 50;
	
	if(true && false){
		System.out.println("AND executed");
	}
	
	//if our player is past the left or right side of the screen
	if (playerX < 0 || playerX > 800){
	// some code that reverses our player's direction
	System.out.println("OR executed");
	}
  }

}
