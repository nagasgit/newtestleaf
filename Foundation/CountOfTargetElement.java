package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOfTargetElement {

    /*
Given a sorted array arr[] and a number x, write a function that
counts the occurrences of x in arr[].
arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
output = 4
    Pseudocode:
    1)Declare the int array and int variable
    2) find the length of array
    3) Declare the forloop and traverse through array
    4) Check the condition to compare each index of the array and targeted value
    5) if it is matches declare one count variable and increase the value
    5) return count
     */

    @Test
    public void test1(){
        int actual = noOfOccurances(new int[]{1, 2, 3, 3, 4, 5, 3}, 3);
        Assert.assertEquals(actual,3);
    }

    @Test
    public void test2(){
        int actual = noOfOccurances(new int[]{1, 2, 3, 4, 5, 6}, 7);
        Assert.assertEquals(actual,0);
    }

    @Test
    public void test3(){
        int actual = noOfOccurances(new int[]{}, 7);
        Assert.assertEquals(actual,0);
    }
    public int noOfOccurances(int[] input, int x) {
        int len = input.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (input[i] == x) {
                count++;
            }
        }

        return count;
    }
}
