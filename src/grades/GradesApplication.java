package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

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

        System.out.println("fry.getGrades() = " + fry.getGrades());
        System.out.println("fry.getGradeAverage() = " + fry.getGradeAverage());
        System.out.println("leela.getGrades() = " + leela.getGrades());
        System.out.println("leela.getGradeAverage() = " + leela.getGradeAverage());

    }

//    public static int generateRandomGrade(){
//        int random = (int)(Math.random()*((100-1)+1));
//        return random;
//    }

    public static void populateGrades(Student student, int numberOfGrades){
        for (int i = 1; i <= numberOfGrades; i++){
            student.addGrade((int)(Math.random()*((100-1)+1)));
        }
    }
}
