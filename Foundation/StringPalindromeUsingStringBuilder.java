package july14.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringPalindromeUsingStringBuilder {

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

    @Test
    public void test1()
    {
        boolean actual = strPalidrome("A man, a plan, a canal: Panama");
        Assert.assertEquals(actual,true);
    }

    @Test
    public void test2()
    {
        boolean actual = strPalidrome("race a car");
        Assert.assertEquals(actual,false);
    }

    @Test
    public void test3()
    {
        boolean actual = strPalidrome("");
        Assert.assertEquals(actual,true);
    }
    public boolean strPalidrome(String str)
    {
        String s = str.toLowerCase().replaceAll("[]^a-zA-Z0-9]", "");
        String ori = s;
        StringBuilder str1 = new StringBuilder(s);
        String reverse = String.valueOf(str1.reverse());
        return reverse.equals(ori);
    }
}
