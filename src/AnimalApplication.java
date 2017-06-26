
/* Runs and Tests the Animal Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 */

import animals.*;
public class AnimalApplication{

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		myAnimal.eat();
		myAnimal.eat("bananas");
		myAnimal.sleep();
		System.out.println(myAnimal.sound());
		
		Cat c = new Cat("Meow!");
		c.eat();
		c.eat("tuna fish");
		c.sleep();
		System.out.println(c.sound());
		
		Bird b = new Bird("Caw");
		b.eat();
		b.eat("tuna fish");
		b.sleep();
		System.out.println(b.sound());
		b.fly();

	}
	
}
