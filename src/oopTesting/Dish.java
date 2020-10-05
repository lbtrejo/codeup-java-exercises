package oopTesting;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("Cost: %d%nName: %s%nRecommended: %b%n", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }

    public static void main(String[] args) {
        Dish noodles = new Dish();
        noodles.costInCents = 1000;
        noodles.nameOfDish = "Veggie noodles";
        noodles.wouldRecommend = true;

        noodles.printSummary();
    }
}

