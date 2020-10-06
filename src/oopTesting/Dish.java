package oopTesting;

public class Dish {
    private int costInCents;
    private String nameOfDish;
    private Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b%n", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }

    public Dish(int cost, String name, boolean recommend){
        this.setCostInCents(cost);
        this.setNameOfDish(name);
        this.setWouldRecommend(recommend);
    }

    public void setCostInCents(int cost){
        this.costInCents = cost;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setNameOfDish(String name){
        this.nameOfDish = name;
    }

    public void setWouldRecommend(boolean recommend){
        this.wouldRecommend = recommend;
    }
    public boolean getWouldRecommend(){
        return this.wouldRecommend;
    }

    public static void main(String[] args) {
        Dish noodles = new Dish(1000, "Veggie noodles", true);
//        noodles.setCostInCents(1000);
//        noodles.setNameOfDish("Veggie noodles");
//        noodles.setWouldRecommend(true);

        noodles.printSummary();

        DishTools.shoutDishName(noodles);
        DishTools.analyzeDishCost(noodles);
        DishTools.flipRecommendation(noodles);
    }
}

