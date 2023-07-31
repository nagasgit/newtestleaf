package july1st.breakoutsession.program;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class MoveZerosToEnd_HW {

    /*
    Given an integer array nums, move all 0's to the end of it while maintaining the
    relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.

    Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]

    Pseudo Code:
    - Find out the input array length
    - For loop to traverse from 0 to array length
    - Another for loop to move the element to the next index position having temp variable
    - if condition to match each index == 0, then assign input[i] to input[i+1] position
    - return the array
     */

    @Test
    public void test1() {
        int[] actual = moveZerosInaArray(new int[]{0, 1, 0, 3, 12});
        //System.out.println(actual);
        AssertJUnit.assertArrayEquals(actual, new int[]{1, 3, 12, 0, 0});
    }

    @Test
    public void test2() {
        int[] actual = moveZerosInaArray(new int[]{0});
        //System.out.println(actual);
        AssertJUnit.assertArrayEquals(actual, new int[]{0});
    }

    @Test
    public void test3() {
        int[] actual = moveZerosInaArray(new int[]{0, 1, 1});
        //System.out.println(actual);
        AssertJUnit.assertArrayEquals(actual, new int[]{1, 1, 0});
    }

    @Test
    public void test4() {
        int[] actual = moveZerosInaArray(new int[]{1, 1, 1});
        //System.out.println(actual);
        AssertJUnit.assertArrayEquals(actual, new int[]{1, 1, 1});
    }

    @Test
    public void test5() {
        int[] actual = moveZerosInaArray(new int[]{0, 1, 0, 1, 0, 1});
        //System.out.println(actual);
        AssertJUnit.assertArrayEquals(actual, new int[]{1, 1, 1, 0, 0, 0});
    }

    public static int[] moveZerosInaArray(int[] input) {
        int len = input.length;
        int temp;
        int k = 0;
        for (int i = 0; i < len; i++) {
            k = i;
            for (int j = i + 1; j < len; j++) {
                if (input[k] == 0) {
                    temp = input[k];
                    //b= input[i+1];
                    input[k] = input[j];
                    input[j] = temp;
                    k++;
                }
            }
            k = 0;
        }
        return input;
    }
}
