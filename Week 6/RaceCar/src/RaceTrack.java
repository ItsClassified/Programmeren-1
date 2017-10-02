
public class RaceTrack {
	RaceCar[] raceCars;
	RaceCar[] finishOrder;
	int distance;
	
	public RaceTrack(int cars, int distance) {
		raceCars = new RaceCar[cars];
		finishOrder = new RaceCar[cars];
		this.distance = distance;
	}
	
	public void addRaceCar(RaceCar car) {
		for (int i = 0; i < raceCars.length; i++) {
			if (raceCars[i] == null) {
				raceCars[i] = car;
				return;
			}
		}
	}
	
	public void doRace() {
		int finished = 0;
		int cars = 0;
		
		for (int i = 0; i < raceCars.length; i++) {
			if (raceCars[i] != null) {
				cars++;
			}
		}
		while (finished < cars) {
			for (int i = 0; i < raceCars.length; i++) {	
				if (raceCars[i] != null) {
					if(raceCars[i].getLocation() < distance) {
						raceCars[i].race();
						if(raceCars[i].getLocation() >= distance) {
							System.out.println(raceCars[i].getName() + " has finished");
							for (int j = 0; j < finishOrder.length; j++) {
								if (finishOrder[j] == null) {
									finishOrder[j] = raceCars[i];
									j = finishOrder.length;
								}
							}
							finished++;
						}
					}
				}
			}
		}
		
		int place= 1;
		System.out.println("*** RESULTS OF THE RACE ***");
		for (int x = 0; x < finishOrder.length; x++) {
			if (finishOrder[x] != null) {
				System.out.println(place + ": " + finishOrder[x].getName() + " (MaxSpeed: " + finishOrder[x].maxSpeed + ", Acceleration: " + finishOrder[x].acceleration + ")");
				place++;
			}
		}
	}
}
