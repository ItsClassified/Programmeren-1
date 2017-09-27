
public class Main {

	public static void main(String[] args) {
		
		Cow anna = new Cow("Anna", 12, 12.5, true);
		Cow betsi = new Cow("Betsi", 12, 12.5, true);
		Cow lisa = new Cow("Lisa", 12, 12.5, true);
		Cow nikki = new Cow("Nikki", 15, 12.5, true);
		
		Farm farm = new Farm("Classified", 4, 2);
		
		farm.addCowToFarm(anna);
		farm.addCowToFarm(betsi);
		farm.addCowToFarm(lisa);
		farm.addCowToFarm(nikki);
		
		farm.print();
		
		farm.farming(2);
		
		farm.print();
	}

}
