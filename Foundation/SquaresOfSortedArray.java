package newtestleaf.Foundation;



import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class SquaresOfSortedArray {

    /*
    Given an integer array nums sorted in non-decreasing order,
    return an array of the squares of each number sorted in non-decreasing order.
    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].

    Example 2:
    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]

    Pseudo Code:
     - Get the input array and find out the length of the array
     - For loop to traverse from 0 index to the length
     - input[i] = input[i] * input[i]
     - Arrays.sort(input);
     - return input;
    */

    @Test
    public void test1() {
        int[] actual = sqrsOfSortedArr(new int[]{-4, -1, 0, 3, 10});
        assertArrayEquals(actual, new int[]{0, 1, 9, 16, 100});
    }

    @Test
    public void test2() {
        int[] actual = sqrsOfSortedArr(new int[]{-7, -3, 2, 3, 11});
        assertArrayEquals(actual, new int[]{4, 9, 9, 49, 121});
    }

    @Test
    public void test3() {
        int[] actual = sqrsOfSortedArr(new int[]{});
        assertArrayEquals(actual, new int[]{});
    }

    public int[] sqrsOfSortedArr(int[] input) {
        int len = input.length;
        for (int i = 0; i < len; i++) {
            input[i] = input[i] * input[i];
        }
        Arrays.sort(input);
        return input;
    }
}
