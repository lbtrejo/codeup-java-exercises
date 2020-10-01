public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1.  Loop Basics
            // a. While loop
        int i = 5;

        while (i <= 15) {
            System.out.printf("%s ", i);
            i++;
        }

            // b. Do While

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        }while(x <= 100);
    }
}
