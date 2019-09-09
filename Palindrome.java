
package Palindrome;

import java.util.Scanner;

/**
 *
 * @author koma9
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the word to test for Palndrome:");
        String cc = input.next();
        System.out.println(isPalindrome(cc));
        
    }
    
    public static boolean isPalindrome(String word){
    
        if(word == null){
            return false;
        }
        String reversed = reverse(word);
        
        return word.equals(reversed);
                    
    
    
    }
    
    public static String reverse(String match){
        
        if(match == null){
            return null;
        }
        if(match.length() <=1){
        
            return match;
        
        }
        return reverse(match.substring(1)) + match.charAt(0);
    
        
    
    }
    


    
    
    
    
}
