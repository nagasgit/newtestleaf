package july14.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ShuffleString {

    /*
    You are given a string s and an integer array indices of the same length.
    The string s will be shuffled such that the character at the ith position
    moves to indices[i] in the shuffled string.  Return the shuffled string.

    Example 1:
    Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3] [leetcdoe]
    Output: "leetcode"
    Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
    Example 2:
    Input: s = "abc", indices = [0,1,2]
    Output: "abc"
    Explanation: After shuffling, each character remains in its position.
    Pseudo Code:
      1) Get the input String and indices Int[] array
      2) length of the indices array
      3) Create a new Char array with the indices array length
      4) for loop to traverse from 0 to indices array length
      5) char[indices[i]] = str.charAt(indices[i]);
      6) return the char array;
     */
    @Test
    public void test1() {
        String actual = shuffleString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        Assert.assertEquals(actual, "leetcode");
    }

    @Test
    public void test2() {
        String actual = shuffleString("abc", new int[]{0,1,2});
        Assert.assertEquals(actual, "abc");
    }

    public String shuffleString(String str, int[] indices) {
        int len = indices.length;
        char[] newStr = new char[len];
        for (int i = 0; i < len; i++) {
            //newStr[indices[i]] = str.charAt(indices[i]);
            newStr[indices[i]] = str.charAt(i);
        }
        String result = String.valueOf(newStr);
        //String result = Arrays.toString(newStr);
        return result;
    }

}
