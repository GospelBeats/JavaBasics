package javaBasics;

public class ClassAndObjects {

	public static void main(String[] args) {
	
	Person mike = new Person("mike");
	mike.setAge(20);
	//mike.age = 20;
	//mike.name = "mike";
	
	Person bob = new Person("bob");
	bob.setAge(39);
	//bob.age = 39;
	//bob.name = "bob";
	
	mike.sayHelloTo(bob);
	bob.sayHelloTo(mike);
	
	//System.out.println("mike is " + mike.age + " years old");
	//System.out.println("bob is " + bob.age + " years old");
	System.out.println(mike.getName() + " is " + mike.getAge() + " years old");
	System.out.println(bob.getName() + " is " + bob.getAge() + " years old");

	}

}
