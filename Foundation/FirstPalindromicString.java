package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class FirstPalindromicString {

    /*
    Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
    A string is palindromic if it reads the same forward and backward.

    Example 1:
    Input: words = ["abc","car","ada","racecar","cool"]
    Output: "ada"
    Explanation: The first string that is palindromic is "ada".
    Note that "racecar" is also palindromic, but it is not the first.

    Example 2:
    Input: words = ["notapalindrome","racecar"]
    Output: "racecar"
    Explanation: The first and only string that is palindromic is "racecar".

    Example 3:
    Input: words = ["def","ghi"]
    Output: ""
    Explanation: There are no palindromic strings, so the empty string is returned.
     */

    /*
    Pseudo Code:
    - Get the String[] input
    - Initialize the str empty variable
    - find out the length of the string[] and store it in a var
    - 1st for loop to traverse from 1 string to another
    - 2nd for loop to traverse within the char of every string from lastchar to >0
    - Store it in an empty str variable as str = str + words[j]
      Input: words = ["abc","car","ada","racecar","cool"]
      Output: "ada"
     */
    @Test
    public void test1()
    {
        String actual = firstPalindromicString(new String[]{"abc", "car", "ada", "racecar", "cool"});
        Assert.assertEquals(actual,"ada");
    }

    public String firstPalindromicString(String[] words)
    {
        String str = "";
        int stringLen = words.length;


        for (int i = 0; i < stringLen; i++)
        {
            //for (int j = words[i].length()-1; j > 0; j--)
            //{
            str = "";
            String original = words[i];
            char[] chars = words[i].toCharArray();
            int charsLen = chars.length;
            for (int j = charsLen-1; j >=0; j--)
            {
                str = str + chars[j];
            }

            if (original.equals(str)){
                return str;
            }
            //}
          //  if
        }

        return null;
    }



}
