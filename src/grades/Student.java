package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

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
        int numberOfGrades = 0;
        for (Integer grade : grades){
            gradeTotal += grade;
            numberOfGrades++;
        }
        return (double)gradeTotal/numberOfGrades;
    }


//    public static void main(String[] args) {
//        Student fer = new Student("Fer");
//        fer.addGrade(100);
//        fer.addGrade(23);
//        fer.addGrade(64);
//        fer.addGrade(97);
//        fer.addGrade(13);
//        fer.addGrade(13);
//
//
//        System.out.println("fer.getName() = " + fer.getName());
//        System.out.println("fer.getGradeAverage() = " + fer.getGradeAverage());
//    }
}
