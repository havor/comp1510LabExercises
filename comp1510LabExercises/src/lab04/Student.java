package lab04;

import java.util.Scanner;
/**
 * Define a student class that stores name, score on test 1, and 
 * score on test 2. Methods prompt for and read in grades,compute 
 * the average, and return a string containing student's info.
 * @author Haihua(Ryan), Tan
 * @version 1.0
 * */
public class Student {
    /**Student name. */
    private String name;
    
    /**test#1 score.*/
    private int test1Score;
    
    /**test#2 score.*/
    private int test2Score;
    
    /**Constructor of Student. 
     * @param name used to create a student record. */
    public Student(String name) {
        this.name = name;
        test1Score = 0;
        test2Score = 0;
    }
    
    /**Second constructor of Student. 
     * @param name used to create a student record.
     * @param test1Score to set test1Score
     * @param test2Score to set test2Score */
    public Student(String name, int test1Score, int test2Score) {
        this.name = name;
        this.test1Score = test1Score;
        this.test2Score = test2Score;
    }
    
    /**Getter of name. 
     * @return the student's name.*/
    public String getName() {
        return name;
    }
    
    /**Getter of test1Score.
     * @return score of test#1. */
    public int getTest1Score() {
        return test1Score;
    }
    
    /**Getter of test2Score.
     * @return score of test#2. */
    public int getTest2Score() {
        return test2Score;
    }
    
    /**Setter of test1Score.
     * @param score value will be set to test1Score*/
    private void setTest1Score(int score) {
        test1Score = score;
    }
    
    /**Setter of test2Score.
     * @param score value will be set to test1Score*/
    private void setTest2Score(int score) {
        test2Score = score;
    }
    
    /**Method to input student's grades.*/
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        int score;
        System.out.println("=========Record of " + getName() + "=============");
        System.out.print("Please enter "
                + getName() 
                + "'s score in test #1: ");
        score = scan.nextInt();
        setTest1Score(score);
        
       
        
        System.out.print("Please enter "
                + getName() 
                + "'s score in test #2: ");
        score = scan.nextInt();
        setTest2Score(score);
        System.out.println();
        //scan.close();
    }
    
    /**Method to calculate the average of test #1 and test #2. 
     * @return int value of average score*/
    public int getAverage() {
        return (getTest1Score() + getTest2Score()) / 2;
    }
    
    
    public String toString(){
        String info = "Name:\t" 
                + getName()
                + "\tTest2:\t"
                + getTest1Score()
                + "\tTest2:\t"
                + getTest2Score()
                + "\tAverage\t"
                + getAverage();
        return info;
    }
    
}
