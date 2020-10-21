package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppUtils {

    public static void populateGrades(ArrayList<Student> studentList, int numberOfGrades){
        for (Student student: studentList){
            for (int i = 1; i <= numberOfGrades; i++){
                student.addGrade((int)(Math.random()*((100-1)+1)));
            }
        }
    }

    public static ArrayList<Student> populateStudents(List<String> studentsNames){
        ArrayList<Student> studentList = new ArrayList<>();
        for (String name: studentsNames){
            studentList.add(new Student(name));
        }
        return studentList;
    }

    public static void populateMap(List<String> githubNames, List<Student> studentObjects, HashMap<String, Student> studentMap){
        for (byte i = 0; i < githubNames.size(); i++) {
            studentMap.put(githubNames.get(i), studentObjects.get(i));
        }
    }
}
