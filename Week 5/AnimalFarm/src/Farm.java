
public class Farm {
	String name;
	Cow[] cows;
	Cow[] agedCows;
	
	public Farm(String name, int cows, int agedCows) {
		this.name = name;
		
		this.cows = new Cow[cows];
		this.agedCows = new Cow[agedCows];
	}
	
	public void addCowToFarm(Cow cow) {
		for (int i = 0; i < cows.length; i++) {
			if(cows[i] == null) {
				cows[i] = cow;
				System.out.println("Cow: " + cow.name + " has been added to farm: " + name);
				return;
			}
		}
		System.out.println("I hope you did not pay to much for this cow cuz he aint gonna fit");
	}
	public void addAgedCowToFarm(Cow cow) {
		for (int i = 0; i < agedCows.length; i++) {
			if(agedCows[i] == null) {
				agedCows[i] = cow;
				System.out.println("Cow: " + cow.name + " has been added to farm: " + name);
				return;
			}
		}
		System.out.println("I hope you did not pay to much for this cow cuz he aint gonna fit");
	}
	
	public void farming(int nrOfYears) {
		for (int i = 0; i < cows.length; i++) {
			if (cows[i] != null) {
				cows[i].aging();
				if (cows[i].age >= 16) {
					System.out.println(cows[i].name + " turned 16 years and there for will be slayed..");
					cows[i] = null;
				}
			}
		}
	}
	
	public void print() {
		System.out.println("Farm " + name);
		System.out.println("");
		for (int i = 0; i < cows.length; i++) {
			if(cows[i] != null) {
				cows[i].print();
			}
		}
	}
}
