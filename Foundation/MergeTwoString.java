package july14.day1.HW;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MergeTwoString {

    /*
        You are given two strings word1 and word2.
        Merge the strings by adding letters in alternating order, starting with word1.
        If a string is longer than the other, append the additional letters onto the
        end of the merged string.  Return the merged string.

        Example 1:

        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r

        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s
        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c   d
     */
    /*
    Pseudo Code:
    -  Get the two input strings
    -  Initialize the empty str variable
    -  Find out the length of each string
    -  if word1 length > word 2 length
    -  then assign word1.len to n else word .len
    -  For loop to traverse from 0 to n
    -  str = str+charsW1[i]+charsW2[i];
     */

    @Test
    public void test1()
    {
        String actual = mergeStrings("abc", "pqr");
        Assert.assertEquals(actual,"apbqcr");
    }

    @Test
    public void test2()
    {
        String actual = mergeStrings("ab", "pqrs");
        Assert.assertEquals(actual,"apbqrs");
    }
    public String mergeStrings(String word1, String word2)
    {
        int w1 = word1.length();
        int w2 = word2.length();
        char[] charsW1 = word1.toCharArray();
        char[] charsW2 = word2.toCharArray();
        String str = "";
           int n;
        if (w1 > w2)
        {
            n = w1;
        }else n= w2;

        for (int i = 0; i < n; i++)
        {
           //charsW1.c
            if (i < charsW1.length) {
                str = str + charsW1[i] + charsW2[i];
            }else{
                str = str + charsW2[i];
            }
            /*if (charsW1[i] == 0)
            {
                str = str+charsW2[i];
            }*/
        }

        return str;
    }

}
