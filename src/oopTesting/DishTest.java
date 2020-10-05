package oopTesting;

public class DishTest {
        public static void main(String[] args) {
            Dish dish1 = new Dish();
            dish1.costInCents = 1500;
            dish1.nameOfDish = "New York Strip";
            dish1.wouldRecommend = false;

            dish1.printSummary();
        }
}
