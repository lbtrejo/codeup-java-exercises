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
        Person Levi = new Person("Levi");
        Levi.getName();
        Levi.sayHello();
        Levi.setName("Levi Trejo");
        Levi.sayHello();
    }
}
