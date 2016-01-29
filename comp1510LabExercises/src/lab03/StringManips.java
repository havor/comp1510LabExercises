package lab03;

import java.util.Scanner;
/**
 * Test several methods for manipulating String objects.
 * @author Haihua(Ryan),Tan
 * @version 1.0 
 */
public class StringManips {
    /**
     * Main method.
     * @param args is unused.
     */
    public static void main(String[] args) {
        String phrase = new String("This is a string test.");
        int phraseLength;    //number of characters in the phrase string
        int middleIndex;     //index of the middle character in the string
        String firstHalf;    //first half of the phrase string
        String secondHalf;   //second half of the phrase string
        String switchedPhrase;  //a new phrase with original halves switched
        String middle3;         //a string contain the middle 3 characters
                                //in the phrase string
        
        String city;
        String province;
            
        //compute the length of and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phrase.length() / 2;
        
        //get the substring for each half of the phrase
        firstHalf = phrase.substring(0, middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        //concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        
        //get a substring of middle 3 characters in the phrase string
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        
        //print information about the phrase
        System.out.println();
        System.out.println("Original phrase: " + phrase);
        System.out.println("Length of the phrase: " 
                            + phraseLength 
                            + " Characters");
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " 
                            + phrase.charAt(middleIndex));
        System.out.println("Switched phrase: " + switchedPhrase);
        
        System.out.println("Middle 3 charcters are: " + middle3);
        System.out.println();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your city: ");
        city = scan.nextLine();
        
        System.out.print("Please enter your province: ");
        province = scan.nextLine();
        System.out.println(province.toUpperCase() 
                           + city.toLowerCase() 
                           + province.toUpperCase());
        scan.close();
    }
}
