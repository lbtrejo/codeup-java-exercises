package GroceryList;

public class GroceryItem {
    private String name, category;
    private int quantity;

    public GroceryItem(String itemName, int itemQuantity, String itemCategory){
        this.name = itemName;
        this.quantity = itemQuantity;
        this.category = itemCategory;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String newCategory){
        this.name = newCategory;
    }

    public void printGroceryItem(){
        System.out.printf("%s -- %d -- %s%n", this.name, this.quantity, this.category);
    }
}
