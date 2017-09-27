
public class Refrigerator {
	FoodItem[] vegetableDrawer = new FoodItem[3];
	FoodItem[] refrigeratorSpace = new FoodItem[7];

	boolean isOn;

	public void switchOn() {
		isOn = true;
	}

	public void switchOff() {
		if (isOn) {
			System.out.println("The Refrigerator will be turned off!");
		}
		isOn = false;
	}
	
	public void open() {
		System.out.println("Regrireator: ");
		for (int i = 0; i < refrigeratorSpace.length; i++) {
			if(refrigeratorSpace[i] != null) {
				System.out.println("Name: " + refrigeratorSpace[i].name + " - Type: " + refrigeratorSpace[i].typeOfFood + " - Weigth: " + refrigeratorSpace[i].weigth);
			}
		}
		
		System.out.println("Vegetable Drawer: ");
		for (int i = 0; i < vegetableDrawer.length; i++) {
			if(vegetableDrawer[i] != null) {
				System.out.println("Name: " + vegetableDrawer[i].name + " - Type: " + vegetableDrawer[i].typeOfFood + " - Weigth: " + vegetableDrawer[i].weigth);
			}
		}
	}
	
	public void getDrinks() {
		System.out.println("Drinks: ");
		for (int i = 0; i < refrigeratorSpace.length; i++) {
			if(refrigeratorSpace[i] != null) {
				if(refrigeratorSpace[i].typeOfFood.equals("drink")) {
					System.out.println("Name: " + refrigeratorSpace[i].name);
				}
			}
		}
	}
	
	public void addToVegetableDrawer(FoodItem foodItem) {
		if (foodItem.typeOfFood.equals("vegetable")) {
			for (int i = 0; i < vegetableDrawer.length; i++) {
				if (vegetableDrawer[i] == null) {
					vegetableDrawer[i] = foodItem;
					System.out.println("Item has been added");
					return;
				}
			}
			System.out.println("The drawer is already full!");
		} else {
			System.out.println("This is not a vegetable and there for cannot be placed in this drawer!");
		}
	}
	
	public void addToRefrigerator(FoodItem foodItem) {
		double totalWeigth = 0.0;
		for (int i = 0; i < refrigeratorSpace.length; i++) {
			if(refrigeratorSpace[i] == null) {
				if((totalWeigth + foodItem.weigth) > 17) {
					System.out.println("Sorry this product is to heavy to go in the refrigerator");
					return;
				} else {
					refrigeratorSpace[i] = foodItem; 
					System.out.println("Item has been added");
					return;
				}		
			} else {
				totalWeigth += refrigeratorSpace[i].weigth;
			}
		}
		System.out.println("Refrigerator is out of space!");
	}
}
