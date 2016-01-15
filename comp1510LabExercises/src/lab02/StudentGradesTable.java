package lab02;
//********************************************************
//File Name: Grades.java
//Author: Hai Hua Tan
//Description: prints the names and grads of students.
//********************************************************

public class StudentGradesTable {
    Student[] students = new Student[]{
            new Student("Joe", 43, 7),
            new Student("William", 50, 8),
            new Student("Mary Sue", 39, 49)
    };;
    
    public static void main(String[] args){
         System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
         System.out.println("==          Student Points          ==");
         System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
         System.out.println();
         //System.out.println(" Name\t Lab\t Bonus\t Total");
         System.out.format("%10s%8s%8s%10s ","Name","Lab","Bonus","Total");
         System.out.println();
         StudentGradesTable table = new StudentGradesTable();
         /*
         grades.students = new Student[]{
                         new Student("Joe", 43, 7),
                         new Student("William", 50, 8),
                         new Student("Mary Sue", 39, 49)
                 };
                 */
         for(int i = 0; i < table.students.length; i++){
             Student student = table.students[i];
             /*
             System.out.print(student.Name + "\t" 
                                 + student.LabPoints + "\t" 
                                 + student.BonusPoints + "\t" 
                                 + (student.LabPoints + student.BonusPoints)
                                 + "\n");
              */
             System.out.format("%10s%8d%8d%10d ",student.Name, student.LabPoints, 
                                 student.BonusPoints, student.LabPoints + student.BonusPoints);
             System.out.println();
         }
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
