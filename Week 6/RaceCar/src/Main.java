
public class Main {

	public static void main(String[] args) {
		RaceTrack track = new RaceTrack(5, 300);
		
		RaceCar car1 = new RaceCar("Car 1", 300, 45);
		RaceCar car2 = new RaceCar("Car 2", 100, 50);
		RaceCar car3 = new RaceCar("Car 3", 200, 50);
		RaceCar car4 = new RaceCar("Car 4", 50, 40);
		RaceCar car5 = new RaceCar("Car 5", 100, 60);
		
		track.addRaceCar(car1);
		track.addRaceCar(car2);
		track.addRaceCar(car3);
		track.addRaceCar(car4);
		track.addRaceCar(car5);
		
		track.doRace();
	}

}
