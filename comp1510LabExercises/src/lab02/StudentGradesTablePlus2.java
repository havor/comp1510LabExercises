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

public class StudentGradesTablePlus2 {
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
                          
             //Use format to align the results.
             System.out.println("Name\t\tLab\tBonus\tTotal\n");
             System.out.println("----\t\t---\t-----\t-----");
             StudentGradesTablePlus2 table = new StudentGradesTablePlus2();
             for (int i = 0; i < table.students.length; i++) {
                 Student student = table.students[i];
                 System.out.format("%-16s%-8d%-8d%-8d",
                                    student.name,
                                    student.labPoints,
                                    student.bonusPoints,
                                    (student.labPoints + student.bonusPoints));
                 System.out.println();
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
