public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println("");

        int myFavoriteNumber = 12;
        System.out.println(myFavoriteNumber);

        String myString = "This is my favorite string";
//        myString = 3.14159;
        System.out.println(myString);

//        long myNumber;
        float myNumber;
//        myNumber = 123;
        myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // Prints 5, 6

        int x = 5;
        System.out.println(++x);
        System.out.println(x);
        // prints 6, 6

//        int class = 15;
        // Above doesn't work, class is a reserved word in Java

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//
//        System.out.println(three);

//        int x = 4;
//        x = x + 5;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        byte max = 127;
        max++;
        System.out.println(max);
    }
}
