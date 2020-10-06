public class Person {
    private String name;
    public String getName(){
//TODO: return the person's name
        System.out.println(name);
        return name;
    }
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
        System.out.println("Name set as: " + this.name);
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person Levi = new Person("Levi");
//        Levi.getName();
//        Levi.sayHello();
//        Levi.setName("Levi Trejo");
//        Levi.sayHello();

        // Testing for exercise #2
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));  // should return True
//        System.out.println(person1 == person2); // Should return false, each person object is only equal to itself

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);  // Expected to be true, each object is set to reference the same original object in this specific case

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());  // John
//        System.out.println(person2.getName());  // John
//        person2.setName("Jane");
//        System.out.println(person1.getName());  // Jane.  The above line sets the name of the reference object for both people.  Hence, Jane is returned in both instances.
//        System.out.println(person2.getName());  // Jane
    }
}
