package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class addOne {

    /*
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.


Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

    * PseudoCode
    *  Iterate through the array in reverse order
    *  if Current index value is less than 9
          increment it by 1 and return the array
    *  Make the current index to 0
    *  Create a new array size of array.length+1 and assign array[0] = 1
    */

    @Test
    public void test1()
    {
        int[] actual = addOneProg(new int[]{1, 2, 3});
        //Assert.ThrowingRunnable
        //Assert.assertArray(actual, new int[]{1,2,4});
        assertArrayEquals(actual, new int[] {1,2,4});
    }

    @Test
    public void test2()
    {
        int[] actual = addOneProg(new int[]{1, 2, 9});
        assertArrayEquals(actual, new int[] {1,3,0});
        //Assert.assertEquals(actual,new int[]{1,3,0});
    }

    @Test
    public void test3()
    {
        //int[] actual = addOneProg(new int[]{9,9});
        assertArrayEquals(addOneProg(new int[]{9,9}), new int[] {1,0,0});
        //Assert.assertEquals(new int[]{1,0,0}, addOneProg(new int[]{9,9}));
        //Assert.assertEquals(actual,new int[]{1,0,0});
    }

    @Test
    public void test4()
    {
        int[] actual = addOneProg(new int[]{9});
        assertArrayEquals(actual, new int[] {1,0});
        //Assert.assertEquals(actual,new int[]{1,0});
    }

    public static int[] addOneProg(int[] array) {
       // int len = array.length;
        for (int i = array.length - 1; i >= 0; i--)  //input - 9,9
        {
            if (array[i] < 9)   //input - 99
            {
                array[i] = array[i] + 1;
                return array;
            }
            array[i] = 0;
        }
            int[] output = new int[array.length + 1]; // 0,0
            output[0] = 1;
            return output;
        }
    }
