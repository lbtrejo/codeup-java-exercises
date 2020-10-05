package oopTesting;

public class DishTest {
        public static void main(String[] args) {
            Dish dish1 = new Dish();
            dish1.costInCents = 1500;
            dish1.nameOfDish = "New York Strip";
            dish1.wouldRecommend = false;

            dish1.printSummary();

            DishTools.shoutDishName(dish1);
            DishTools.analyzeDishCost(dish1);
            DishTools.flipRecommendation(dish1);

            System.out.println(DishTools.AVERAGE_COST_OF_DISH_IN_CENTS);
        }
}
