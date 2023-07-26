package july14.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringPalindrome {

    /*
    A phrase is a palindrome if, after converting all uppercase letters
    into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
     */

    /*
    Pseudo Code:
     * Step1: Declare the string
     * Step2: Remove the special and non Alpha numeric characters
     * Step3: Convert all upper case into lower case
     * Step4: iterate the string in reverse
     * Step5: compare string1 with string 2
     * Step6: if matches return true else false
     */

    @Test
    public void test1()
    {
        boolean actual = strReverse("A man, a plan, a canal: Panama");
        Assert.assertEquals(actual,true);
    }
    public boolean strReverse(String str)
    {
        //str = str.replaceAll("[^a-zA-Z0-9]", "");
        // regex [^a-zA-Z0-9]  ---> replaceAll other than(^) the given [a-zA-Z0-9]
        String s1 = str.toLowerCase().replaceAll("[a-z0-9]]", "");
        //String s = str.replaceAll("[^a-zA-Z0-9]","");
        String original = s1;
        String rev = "";
        //int len = str.length();
        //char[] chars = str.toCharArray();
        for (int i = str.length()-1; i > 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        return rev.equals(original);
    }



}
