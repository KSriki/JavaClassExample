package cars;

public class Boat extends Vehicle{

	public Boat(){
		super("Boat");
	}
	
	public Boat(String n){
		super(n);
	}
	
	/**
	 * Boats can move on water. 
	 */
	public void sail(){
		if(this.inMotion){
			System.out.printf("%s has left the harbor!\n", this.name);
		}
		else{
			System.out.printf("Woah! Hold on, the %s is at rest! We haven't even left the harbor yet!\n",this.name);
		}
	}
}
