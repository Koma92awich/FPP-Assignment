Package Palindrome;

import static org.junit.Asssert.*;

public class PalindromeTest{

    @Test
    public void test(){
        
        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("BOB"));
        assertFalse(isPalindrome("GODFREY"));
        assertFalse(isPalindrome(""));


    }



}