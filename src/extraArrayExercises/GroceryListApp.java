package extraArrayExercises;
import util.Input;

public class GroceryListApp {
    /*
    1. Create a command line grocery list maker
    - before prompting the user to enter each item, ask how many items will be
      entered
    - for each item, the user should be prompted to enter in the name, quantity,
      and category of each grocery item
    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
      objects to store in an array
    - once the user has entered all items, print out all items grouped by
      category and alphabetized in each group
     */
    public static void main(String[] args) {
        System.out.println("Grocery Lister 3001");
        System.out.println("==================================================");
        Input input = new Input();
        int listSize = input.getInt("How many items will be added to the list: ");
        System.out.println("listSize = " + listSize);
        GroceryItem[] listArray = new GroceryItem[listSize];

        for (byte i = 0; i < listArray.length; i++) {
            GroceryItem newItem = new GroceryItem();
            listArray[i] = newItem;
        }

        for (GroceryItem item : listArray) {
            item.printGroceryItem();
        }
    }
}
