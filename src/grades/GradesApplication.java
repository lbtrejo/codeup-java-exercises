package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        boolean continueLoop = true;

        Student fry = new Student("Philip J. Fry");
        Student leela = new Student("Turanga Leela");
        Student bender = new Student("Bender Bending Rodriguez");
        Student professor = new Student("Professor Farnsworth");
        Student zoidberg = new Student("Dr. Zoidberg");

        students.put("justfry1999", fry);
        students.put("schnookums1", leela);
        students.put("shutupbaby420", bender);
        students.put("davinciSucks42", professor);
        students.put("johnzoidberg3", zoidberg);

        GradesApplication.populateGrades(zoidberg, 5);
        GradesApplication.populateGrades(professor, 5);
        GradesApplication.populateGrades(bender, 5);
        GradesApplication.populateGrades(leela, 5);
        GradesApplication.populateGrades(fry, 5);

        System.out.printf("Welcome!%n%n");
        System.out.printf("Here are the GitHub usernames of our students:%n%n");
        for (String key : students.keySet()){
            System.out.printf("|%s| ", key);
        }
        System.out.println();

        while (continueLoop){
            String studentSelection = input.getString("What student would you like more information on?");
            if (students.containsKey(studentSelection)){
                System.out.printf("Name: %s - GitHub Username: %s%n", students.get(studentSelection).getName(), studentSelection);
                System.out.println("Current Grades: " + students.get(studentSelection).getGrades());
                System.out.printf("Current Average: %.2f%n%n", students.get(studentSelection).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", studentSelection);
            }
            continueLoop = input.yesNo("Would you like to see another student?");
        }
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void populateGrades(Student student, int numberOfGrades){
        for (int i = 1; i <= numberOfGrades; i++){
            student.addGrade((int)(Math.random()*((100-1)+1)));
        }
    }
}
