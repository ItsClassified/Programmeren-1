
public class Cow {
	// Variables
	String name;
	int age;
	double price;
	boolean hasMilk = true;
	
	// Constructor
	public Cow(String name, int age, double price, boolean hasMilk) {
		this.name = name;
		this.age = age;
		this.price = price;
		this.hasMilk = hasMilk;
	}
	
	public void aging() {
		// Add 1 year to the cow his age
		age++;		
		// Take 1/16th of his price away since he aged a year
		price = (price - (price/16));
		// Check if he is 16 year already, if so set hasMilk to no
		if(age == 16) {
			hasMilk = false;
		}
	}
	
	public void print() {
		System.out.println("Cow " + name);
		System.out.println("------------");
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Milk: " + hasMilk);
		System.out.println(""); // blank line incase more as 1 are printed
	}
}
