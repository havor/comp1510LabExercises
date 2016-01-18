//********************************************************
//File Name: StudentGradesTable.java
//Author: Hai Hua Tan
//Description: prints the names and grads of students.
//********************************************************
package lab02;


public class StudentGradesTable {
    Student[] students = new Student[]{
            new Student("Joe", 43, 7),
            new Student("William", 50, 8),
            new Student("Mary Sue", 39, 10),
            new Student("Susan", 47, 8),
            new Student("Henry", 38,7)
    };
    
    public static void main(String[] args){
             System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
             System.out.println("==          Student Points          ==");
             System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
             System.out.println();
             
             //Use format to align the result
             System.out.format("%-10s%-10s%-10s%-10s ","Name","Lab","Bonus","Total");
             System.out.println();
             System.out.format("%-10s%-10s%-10s%-10s ","---","---","----","-----");
             System.out.println();
             StudentGradesTable table = new StudentGradesTable();
    
             for(int i = 0; i < table.students.length; i++){
                 Student student = table.students[i];
    
                 System.out.format("%-10s%-10d%-10d%-10d ",student.Name, student.LabPoints, 
                                     student.BonusPoints, student.LabPoints + student.BonusPoints);
                 System.out.println();
             }
             
             
             //Use tab to align the result.
//             System.out.println("Name\t  Lab\t  Bonus\t  Total\n");
//             System.out.println("----\t  ---\t  ----\t  -----");
//             StudentGradesTable table = new StudentGradesTable();
//             for(int i = 0; i < table.students.length; i++){
//                 Student student = table.students[i];
//                 System.out.println(student.Name + "\t  "
//                                    + student.LabPoints + "\t  "
//                                    + student.BonusPoints + "\t  "
//                                    + (student.LabPoints + student.BonusPoints));
//           }
             
             
         }
       
    class Student{
        String Name;
        int LabPoints;
        int BonusPoints;
        
        public Student(String Name, int LabPoints, int BonusPoints){
            this.Name = Name;
            this.LabPoints = LabPoints;
            this.BonusPoints = BonusPoints;
        }
    }

}
