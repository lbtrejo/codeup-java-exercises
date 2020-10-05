package oopTesting;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %s\nName: %s\nRecommended: %s", costInCents, nameOfDish, wouldRecommend);
    }

    public static void main(String[] args) {
        Dish noodles = new Dish();
        noodles.costInCents = 1000;
        noodles.nameOfDish = "Veggie noodles";
        noodles.wouldRecommend = true;

        noodles.printSummary();
    }
}

