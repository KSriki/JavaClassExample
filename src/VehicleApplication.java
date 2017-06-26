
/* Runs and Tests the Vehicle Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 */

import cars.*;
public class VehicleApplication {

	public static void main(String args[]){
		
		//Vehicle superclass
		Vehicle v = new Vehicle();
		v.stop();
		v.run();
		v.deaccelerate(4);
		v.accelerate(5);
		v.stop();
		
		//Car subclass
		Car c = new Car();
		c.stop();
		c.run();
		c.deaccelerate(4);
		c.accelerate(5);
		c.stop();
		
		//Boat subclass
		Boat b = new Boat();
		b.stop();
		b.run();
		b.deaccelerate(4);
		b.accelerate(5);
		b.stop();
		
		//Plane subclass
		Plane p = new Plane();
		p.stop();
		p.run();
		p.deaccelerate(4);
		p.accelerate(5);
		p.stop();
	}
}
