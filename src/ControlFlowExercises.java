public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1.  Loop Basics
            // a. While loop
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }

            // b. Do While
        // Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//        } while(x <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
        int x = 100;
        do {
            System.out.println(x);
            x -= 5;
        } while(x >= -10);

    }
}
