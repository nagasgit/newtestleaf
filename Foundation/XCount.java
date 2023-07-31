package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class XCount {
    /*
            Given an integer array arr, count how many elements x there are,
            such that x + 1 is also in arr.
            If there are duplicates in arr, count them separately.

            example 1:
                input = [1, 2, 3]
                output = 2
                explanation:
                when x is 1, we see x+1 (2) is present in input
                when x is 2, we see x+1 (3) is present in input
                when x is 3, we see x+1 (4) is not present in input
                so no of presence of x+1 is 2
            example 2:
              input = [1, 1, 3, 3, 5, 5, 7, 7]
              output = 0
              explanation: no occurence of x+1 for x


            example 3: input = [1, 1, 2]
              output = 2
              explanation:
              when x is 1, we see x+1 (2) is present in input
              when x is 1, we see x+1 (2) is present in input
              when x is 2, we see x+1 (3) is not present in input
     */

     /*
      Pseudo Code:
       - Input - int arry[]
       - Initialize the count variable with 0
       - Nested for loop to check if input[i]+1==input[j], if matches count++
       - return count
             input = [1, 2, 3]
             output = 2
     */

    @Test
    public void test1()
    {
        int actual = xCount(new int[]{1, 2, 3});
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void test2()
    {
        int actual = xCount(new int[]{1, 1, 3, 3, 5, 5, 7, 7});
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void test3()
    {
        int actual = xCount(new int[]{1, 1, 2});
        Assert.assertEquals(actual, 2);
    }
    public int xCount(int[] arr) {
        int len = arr.length;
        int count = 0;
        //Input - [1, 2, 3]
        for (int i = 0; i < len; i++) {            //[1, 2, 3]
            for (int j = i + 1; j <= len-1; j++) {
                if ((arr[i] + 1) == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
