package extraArrayExercises;

import util.Input;

public class GroceryItem {
    /*
    - for each item, the user should be prompted to enter in the name, quantity,
      and category of each grocery item
    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
      objects to store in an array
     */
    private String name;
    private int quantity;
    private String category;

    public GroceryItem(){
        this.name = new Input().getString("Item name: ");
        this.quantity = new Input().getInt("Item quantity: ");
        this.category = new Input().getString("Item category: ");
    }

    public void printGroceryItem(){
        System.out.printf("%s -- %d -- %s", this.name, this.quantity, this.category);
    }
}
