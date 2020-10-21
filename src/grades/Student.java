package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String studentName){
        this.name = studentName;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        int gradeTotal = 0;
        for (Integer grade : this.grades){
            gradeTotal += grade;
        }
        return (double)gradeTotal/this.grades.size();
    }

}
