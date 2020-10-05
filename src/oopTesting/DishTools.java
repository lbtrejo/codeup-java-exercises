package oopTesting;

public class DishTools {
    public final static int AVERAGE_COST_OF_DISH_IN_CENTS = 13000;

    public static void shoutDishName(Dish dishObject){
        System.out.println(dishObject.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish dishObject){
        if (dishObject.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average");
        } else {
            System.out.println("Less expensive than average");
        }
    }

    public static boolean flipRecommendation(Dish dishObject){
        if (dishObject.wouldRecommend) {
            System.out.println("Returning false");
            return dishObject.wouldRecommend = false;
        } else {
            System.out.println("Returning true");
            return dishObject.wouldRecommend = true;
        }
    }
}
