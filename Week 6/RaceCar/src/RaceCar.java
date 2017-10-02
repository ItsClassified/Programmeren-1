
public class RaceCar {
	// Variables
	String name;
	int location = 0;
	int speed = 0;
	int acceleration;
	int maxSpeed;
	
	
	
	// Constructor for RaceCar
	public RaceCar(String name, int maxSpeed, int acceleration) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
	}
	
	public void race() {
		if((speed + acceleration) >= maxSpeed) {
			speed = maxSpeed;
		} else {
			speed += acceleration;
		}
		location += speed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public int getLocation() {
		return location;
	}
	
	public int getSpeed() {
		return speed;
	}
}
