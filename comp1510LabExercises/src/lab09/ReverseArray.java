package lab09;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("What's the size of the array?");
        size = scan.nextInt();
        final int SIZE = size; 
        int[] array= new int[SIZE];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Input a integer for array[" + i + "]: ");
            array[i] = scan.nextInt();
        }
        System.out.println();
        System.out.println("The data in the original array:");
        for (int i = 0; i < size; i++) {
             System.out.print(array[i] + " ");
        }
        
        for (int i = 0;  i < SIZE / 2; i++){
            int temp = array[i];
            array[i] = array[SIZE-1-i];
            array[SIZE-1-i] = temp;
        }
        
        System.out.println();
        System.out.println("The reversed array data:");
        for (int i = 0; i < size; i++) {
             System.out.print(array[i] + " ");
        }
        

    }
}
