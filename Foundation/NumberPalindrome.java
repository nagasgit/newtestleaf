package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class NumberPalindrome {

    /*
    Given an integer x, return true if x is a palindrome,and false otherwise.
    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
    Therefore, it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.

    PseudoCode:
    1) Get the integer number
    2) Initialize two int variables: n, reverse = 0;
    3) while loop to check whether the n > 0
    4) remainder = n % 10;  //141
    5) remainder.toString();
    5) reverse = reverse + remainder;
    5) n = n /10;

     */

    @Test
    public void test1() {
        boolean actual = numberPalindrome(121);
        Assert.assertEquals(actual, true);
    }

    @Test
    public void test2() {
        boolean actual = numberPalindrome(13);
        Assert.assertEquals(actual, false);
    }

    @Test
    public void test3() {
        boolean actual = numberPalindrome(-121);
        Assert.assertEquals(actual, false);
    }

    public boolean numberPalindrome(int number) {
        int remainder;
        String reverse = "";
        int input = number;

        if (number < 0) {
            return false;
        }
        while (number != 0)  // 156
        {
            //if (number)
            remainder = number % 10;  //1
            number = number / 10;     //0
            reverse = reverse + String.valueOf(remainder);  //651

        }
        int result = Integer.parseInt(reverse);
        if (result == input) {
            return true;
        } else {
            return false;
        }
    }

}
