package oopTesting;

public class DishTest {
        public static void main(String[] args) {
            Dish dish1 = new Dish(1500, "New York Strip", false);
//            dish1.setCostInCents(1500);
//            dish1.setNameOfDish("New York Strip");
//            dish1.setWouldRecommend(false);

            dish1.printSummary();

            DishTools.shoutDishName(dish1);
            DishTools.analyzeDishCost(dish1);
            DishTools.flipRecommendation(dish1);

            System.out.println(DishTools.AVERAGE_COST_OF_DISH_IN_CENTS);
        }
}
