package lab04;

/**
 * Use Student class to get test grades for two students and compute averages.
 * @author Haihua (Ryan), Tan
 * @version 1.0
 * */
public class Grades {
    /**
     * Main entry of the program.
     * @param args is unused
     * */
    public static void main(String[] args) {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        
        student1.inputGrades();
        student2.inputGrades();
        
        System.out.println();
        
        System.out.println("============Students info=====================");
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}
