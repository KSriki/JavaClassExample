/*
 * A Simple Bird subclass
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 * 
 */

package animals;

public class Bird extends Animal{
	
	public Bird(String s){
		super(s,"Bird");
	}
	
	public void fly(){
		System.out.println("The bird flys in the sky.");
	}

}
