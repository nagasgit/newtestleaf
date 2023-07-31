package newtestleaf.Foundation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MoveZeros {

    /*
    Given an integer array nums, move all 0's to the end of it while maintaining the
    relative order of the non-zero elements.  Note that you must do this in-place without
    making a copy of the array.

    Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]

    Example 2:
    Input: nums = [0]
    Output: [0]
     */

    @Test
    public void test1()
    {
        int[] actual = moveZeros(new int[]{0, 1, 0, 3, 12});
        assertArrayEquals(actual,new int[] {1,3,12,0,0});
    }

    @Test
    public void test2()
    {
        int[] actual = moveZeros(new int[]{0});
        assertArrayEquals(actual,new int[] {0});
    }
    public int[] moveZeros(int[] input) {
        int len = input.length;
        int temp, k;
        for (int i = 0; i < len; i++) {
            k = i;
            for (int j = i + 1; j < len; j++)  //[0,1,0,3,12] //1,0,0,3,12
            {
                if (input[k] == 0) {
                    temp = input[j];
                    input[j] = input[k];
                    input[k] = temp;
                    k++;
                }
            }
        }
        return input;
    }
}
