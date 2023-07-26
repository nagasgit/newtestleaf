package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CountOfX_HW {

    /*
    Given an integer array arr, count how many elements x there are,
>   such that x + 1 is also in arr.
>   If there are duplicates in arr, count them separately.
>
>   example 1: input = [1, 2, 3]
>              output = 2
>            explanation: when x is 1, we see x+1 (2) is present in input
>                         when x is 2, we see x+1 (3) is present in input
>                         when x is 3, we see x+1 (4) is not present in input
>                        so no of presence of x+1 is 2
>   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
>              output = 0
>              explanation: no occurence of x+1 for x
>
>   example 3: input = [1, 1, 2]
>              output = 2
>              explanation: when x is 1, we see x+1 (2) is present in input
>                           when x is 1, we see x+1 (2) is present in input
>                           when x is 2, we see x+1 (3) is not present in input

Pseudo Code:
    - Array input to be sorted first
    - Find out the length of the array
    - For loop to traverse though the array length from 0
    - Another for loop to be traversed from 1
    - if condition to be match 1st element + 1 == rest of the elements in the array
    - if matches, count++.  else continue.
     */

    @Test
    public void test1() {
        int actual = countOfX(new int[]{1, 2, 3});
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void test2() {
        int actual = countOfX(new int[]{1, 1, 3, 3, 5, 6, 7, 7});
        Assert.assertEquals(actual, 3);
    }

    @Test
    public void test3() {
        int actual = countOfX(new int[]{1, 1, 2});
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void test4() {
        int actual = countOfX(new int[]{1, 0, 2});
        Assert.assertEquals(actual, 2);
    }

    public int countOfX(int[] input) {
        Arrays.sort(input);
        int len = input.length;
        int count = 0;
        //[1,2,3]
        for (int i = 0; i < len; i++)  // 1, 1, 3, 3, 5, 5, 7, 7
        {
            for (int j = i + 1; j <= len - 1; j++)  // 1, 3, 3, 5, 5, 7, 7
            {
                if (input[i] + 1 == input[j]) {
                    count++;
                }
            }
        }
        return count;
    }


}
