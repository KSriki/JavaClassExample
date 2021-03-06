/* A Simple Vehicle Implementation
 * Srikant Kumar Kalaputapu
 * June 26th, 2017
 * 
 */

package cars;

public class Vehicle implements iVehicle{

	protected double velocity = 0;		//speed of vehicle
	protected boolean inMotion = false;	//is the vehicle in motion
	protected String name;				//name of the vehicle
	
	public Vehicle(){
		this.name = "Vehicle";
	}
	
	public Vehicle(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		if(!inMotion){
			inMotion = true;
			this.accelerate(1);
			System.out.printf("The %s is starting.\n",this.name);
			// TODO Auto-generated method stub
		
		}
		else{
			System.out.printf("The %s is already in motion.\n",this.name);
		}
		
	}

	@Override
	public void stop() {
		if(inMotion){
			
			System.out.printf("The %s suddenly brakes.\n", this.name);
			this.deaccelerate(this.velocity);
		}
		else{
			System.out.printf("The %s is stopped.\n", this.name);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accelerate(double x) {
		System.out.printf("The %s increases its speed by %.2f.\n",this.name,x);
		this.velocity += x;
		if(this.velocity < 0 ){
			System.out.printf("The %s is moving in reverse! It is moving at %.2f.\n", this.name,(-1)*this.velocity);
		}
		else if(this.velocity == 0){
			System.out.printf("The %s has come to a halt.\n",this.name);
		}
		else{
			System.out.printf("The %s is moving at %.2f.\n", this.name,this.velocity);
		}
		// TODO Auto-generated method stub
		
		
	}
	
	/**
	 * Determines if the Vehicle is moving or not
	 * @return true or false if the vehicle is moving.
	 */
	public boolean isMoving(){
		return inMotion;
	}

	@Override
	public void deaccelerate(double y) {
		// TODO Auto-generated method stub
		System.out.printf("The %s decreases its speed by %.2f.\n",this.name,y);
		this.velocity -= y;
		if(this.velocity < 0 ){
			System.out.printf("The %s is moving in reverse! It is moving at %.2f.\n", this.name,(-1)*this.velocity);
		}
		else if(this.velocity == 0){
			System.out.printf("The %s has come to a halt.\n",this.name);
			this.inMotion = false;
		}
		else{
			System.out.printf("The %s is moving at %.2f.\n", this.name,this.velocity);
		}
	}

	public double getVelocity() {
		return velocity;
	}

	public void setSpeed(double velocity) {
		this.velocity = velocity;
		System.out.printf("The %s Speed is %.2f.\n",this.name,this.velocity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
