
/* Simple Vehicle Interface
 * Srikant Kumar Kalaputapu
 * June 26, 2017
 * 
 */

package cars;

public interface iVehicle{
	
	/**
	 * Starts the vehicle
	 */
	public void run();
	
	/**
	 * Stops the vehicle
	 */
	public void stop();
	
	/**
	 * Increases the Vehicle's velocity (forward is positive direction)
	 * @param x - speed up the vehicle by x units
	 */
	public void accelerate(double x);
	
	/**
	 * Decreases the Vehicle's velocity (backward is negative direction)
	 * @param y - speed down the vehicle by y units
	 */
	public void deaccelerate(double y);
	
}
