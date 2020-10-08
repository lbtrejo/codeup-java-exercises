import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person p){
//        Person[] newArray = new Person[array.length+1];
        Person[] newArray = Arrays.copyOf(array, (array.length+1));
        newArray[array.length] = p;

        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        // Without Arrays.toString(array), the array printed on its own will only show the referenceID of where the array can be accessed in memory
        // With Arrays.toString, all of the elements in the array will be printed as strings in a more familiar array notation [ element1, element2, elementx]
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Levi");
        people[1] = new Person("Brandon");
        people[2] = new Person("Trejo");

        Person nickname = new Person("Leviticus");
        System.out.println(nickname.getName());

//        System.out.println(Arrays.toString(people));
//        System.out.println(people[0].getName());
        // Regular for
//        System.out.println("Regular Loop:");
//        for (byte i = 0; i < people.length; i++) {
//            System.out.println(people[i].getName());
//        }
//        System.out.println();
//        System.out.println("Enhanced loop: ");
//        // Enhanced for
//        for (Person p : people) {
//            System.out.println(p.getName());
//        }
//        Arrays.fill();
        Person[] newPeople = addPerson(people, nickname);
        System.out.println(newPeople[0].getName());
        System.out.println(newPeople[1].getName());
        System.out.println(newPeople[2].getName());
        System.out.println(newPeople[3].getName());
        System.out.println(newPeople.length);
    }
}
