package GroceryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import util.Input;

public class GroceryList {

    private final HashMap<String, GroceryItem> groceryList = new HashMap<>();
    private final static ArrayList<String> categories = new ArrayList<>(Arrays.asList("meat", "dairy", "frozen", "drink", "misc"));


    public GroceryList(GroceryItem... items){
        Collections.sort(categories);
        for (GroceryItem item: items){
            groceryList.put(item.getName(), item);
        }
    }

    // select a category to add an item to

    public static String selectCategory(){
        Input input = new Input();

        System.out.println(categories.toString());
        return "String";
    }

    // add item to list

    // remove item from list

    // edit item in list

    // print categories

    // get list


}
