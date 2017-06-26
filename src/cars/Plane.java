package cars;

public class Plane extends Vehicle{
	
	public Plane(){
		super("Plane");
	}
	
	public Plane(String n){
		super(n);
	}
	
	/**
	 * Planes can fly. 
	 */
	public void fly(){
		if(this.inMotion){
			System.out.printf("%s is taking off!", this.name);
		}
		else{
			System.out.printf("Woah! Hold on, the %s hasn't even started moving!",this.name);
		}
	}
	

}
