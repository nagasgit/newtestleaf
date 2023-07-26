package july8.day2;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class ReturnArrayIndices {

    /*
    Pseudo code:
    1) Get the int array length
    2) For loop to traverse through the array
    3) if condition to sum the (two index values) == targetno
       yes, then return the array positions.
     */

    @Test
    public void test1() {
        int[] actual = returnArrayIndices(new int[]{1, 2, 3}, 4);
        AssertJUnit.assertArrayEquals(actual, new int[]{0, 2});
    }

    @Test
    public void test2() {
        int[] actual = returnArrayIndices(new int[]{3, 2, 4}, 6);
        AssertJUnit.assertArrayEquals(actual, new int[]{1, 2});
    }

    @Test
    public void test3() {
        int[] actual = returnArrayIndices(new int[]{3, 3}, 6);
        AssertJUnit.assertArrayEquals(actual, new int[]{0, 1});
    }

    public int[] returnArrayIndices(int[] input, int target) {
        int len = input.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if ((input[i] + input[j]) == target) {
                    return new int[]{i, j};
                }
            }

        }
//1,2,3  --> 4
        return new int[] {-1,-1};
    }
}
