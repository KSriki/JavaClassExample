/*
 * Simple Animal Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 * 
 */

package animals;
public class Animal implements iAnimal {

	private String sound;
	private String type;
	
	public Animal(){
		this.sound = "The animal makes a sound";
		this.type = "Animal";
	}
	
	public Animal(String s, String type){
		this.sound = s;
		this.type = type;
	}
	
	@Override
	public void sleep() {
		System.out.printf("The %s sleeps. Shhhhhhh!\n",this.type);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		System.out.printf("%s eats.\n",type);
		// TODO Auto-generated method stub
		
	}
	
	public void eat(String food){
		System.out.printf("%s eats %s.\n",type,food);

	}

	public void eat(String food, int quant){
		System.out.printf("%s eats %d amount of %s.\n", type, quant, food);

	}
	
	@Override
	public String sound() {
		return this.sound;
	}

}
