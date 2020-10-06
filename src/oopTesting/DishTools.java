package oopTesting;

public class DishTools {
    public final static int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName(Dish dishObject){
        System.out.println(dishObject.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dishObject){
        if (dishObject.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish dishObject){
        dishObject.setWouldRecommend(!dishObject.getWouldRecommend());
        System.out.println(dishObject.getWouldRecommend());
    }
}
