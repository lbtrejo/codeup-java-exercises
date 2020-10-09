public class AbstractTesting {
    public static void main(String[] args) {
        Employee rookie = new Developer("Arnold", "Software Design");
        Employee leader = new Manager("Rosemary", "Engineering");
        System.out.println("rookie.getName() = " + rookie.getName());
        System.out.println("rookie.getDepartment() = " + rookie.getDepartment());
        System.out.println("rookie.work() = " + rookie.work());
        System.out.println("===================================");
        System.out.println("leader.getName() = " + leader.getName());
        System.out.println("leader.getDepartment() = " + leader.getDepartment());
        System.out.println("leader.work() = " + leader.work());
        System.out.println("===================================");
    }
}
