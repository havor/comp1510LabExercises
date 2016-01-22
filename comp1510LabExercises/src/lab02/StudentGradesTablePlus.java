//********************************************************
//File Name: StudentGradesTable.java
//Author: Hai Hua Tan
//Description: prints a table of students' grades
//********************************************************
package lab02;
/**
 * @author Hai Hua Tan
 * @version 1.0
 */

public class StudentGradesTablePlus {
    Student[] students = new Student[]{
            new Student("Joe", 43, 7),
            new Student("William", 50, 8),
            new Student("Mary Sue", 39, 10),
            new Student("Susan", 47, 8),
            new Student("Henry", 38,7)
    };
    
    public static void main(String[] args) {
             System.out.println("///////////////////" 
                                 + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
             System.out.println("==          Student Points          ==");
             System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 
                                 + "///////////////////");
             System.out.println();
                          
             //Use tab to align the result.
             System.out.println("Name\t\tLab\tBonus\tTotal\n");
             System.out.println("----\t\t---\t-----\t-----");
             StudentGradesTablePlus table = new StudentGradesTablePlus();
             for (int i = 0; i < table.students.length; i++) {
                 Student student = table.students[i];
                 String formatedName = student.name.length() > 7 
                         ? (student.name + "\t") : (student.name + "\t\t");
                 System.out.println(formatedName
                                    + student.labPoints + "\t"
                                    + student.bonusPoints + "\t"
                                    + (student.labPoints + student.bonusPoints)
                                    );
           }             
         }
       
    /**
     * 
     * */
    private class Student {
        private String name;
        private int labPoints;
        private int bonusPoints;
        
        public Student(String name, int labPoints, int bonusPoints){
            this.name = name;
            this.labPoints = labPoints;
            this.bonusPoints = bonusPoints;
        }
    }
}
