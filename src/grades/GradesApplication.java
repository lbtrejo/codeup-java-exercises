package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();
        boolean continueLoop = true;

        List<String> studentList = Arrays.asList("Philip J. Fry", "Turanga Leela", "Bender Bending Rodriguez", "Professor Farnsworth", "Dr. Zoidberg");
        List<String> githubList = Arrays.asList("justfry1999", "schnookums1", "shutupbaby420", "davinciSucks42", "johnzoidberg3");
        ArrayList<Student> studentObjects = AppUtils.populateStudents(studentList);
        AppUtils.populateMap(githubList, studentObjects, students);
        AppUtils.populateGrades(studentObjects, 10);

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
}
