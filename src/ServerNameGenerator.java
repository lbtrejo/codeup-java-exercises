public class ServerNameGenerator {
    public static String[] alpha = {"pizza", "sandwich", "taco", "burger", "steak", "fries", "pasta", "cereal", "toast", "butter"};
    public static String[] omega = {"agreeable", "ambitious", "brave", "calm", "delightful", "eager", "faithful", "gentle", "happy", "jolly"};

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", getRandomElement(omega), getRandomElement(alpha) );
        }

    public static String getRandomElement(String [] array){
        return array[(int)(Math.random()*((array.length-1)+1))];
    }
}
