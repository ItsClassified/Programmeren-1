
public class Main {

	public static void main(String[] args) {
		
		Refrigerator koelkast = new Refrigerator();
		
		FoodItem komkommer = new FoodItem("Komkommer", "vegetable", 17.10);	
		FoodItem tomaat = new FoodItem("Tomaat", "vegetable", 1.20);
		FoodItem spinazie = new FoodItem("Spinazie", "vegetable", 5.30);
		FoodItem bloemkool = new FoodItem("Bloemkool", "vegetable", 5.40);
		FoodItem appel = new FoodItem("Appel", "fruit", 1.50);
		FoodItem sinas = new FoodItem("Sinas", "drink", 1.50);
		
		koelkast.addToVegetableDrawer(komkommer);
		koelkast.addToVegetableDrawer(tomaat);
		koelkast.addToVegetableDrawer(spinazie);
		koelkast.addToVegetableDrawer(bloemkool);
		koelkast.addToVegetableDrawer(appel);
		
		koelkast.addToRefrigerator(komkommer);
		koelkast.addToRefrigerator(tomaat);
		koelkast.addToRefrigerator(spinazie);
		koelkast.addToRefrigerator(bloemkool);
		koelkast.addToRefrigerator(appel);
		koelkast.addToRefrigerator(tomaat);
		koelkast.addToRefrigerator(spinazie);
		koelkast.addToRefrigerator(bloemkool);
		
		koelkast.addToRefrigerator(sinas);

		koelkast.open();
		
		koelkast.getDrinks();

	}

}
