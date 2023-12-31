package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveTargetElement {

    /*
    6. Remove the target element in the array
        example 1: input = [2, 3, 3, 4, 5], target=3
                   output = [2, 4, 5]
                   explanation: when 3 is removed from input array,
                                output is [2, 4, 5]
        example 2: input = [2, 2], target=2
                   output = []
                   explanation: when 2 is removed, output would be empty array/
     */
    /*
      Pseudo Code:
      - Get the input array
      - For loop to traverse from 1st index to array length
      - if condition to check the target element matches iwth any of the array position
      - remove that element if matches
     */

    @Test
    public void test1()
    {
        int[] actual = removeTargetEle(new int[]{2, 3, 3, 4, 5}, 3);
        Assert.assertEquals(actual,new int[] {2,4,5});
    }

    @Test
    public void test2()
    {
        int[] actual = removeTargetEle(new int[]{2, 2}, 2);
        Assert.assertEquals(actual,new int[] {});
    }
    public int[] removeTargetEle(int[] input, int ele)
    {
        int len = input.length;
        int k =0;
        int[] newInput = new int[len-2];
        for (int i =0; i < len; i++)
        {
            if (input[i] != ele)

            {
                newInput[k] = input[i];
                k++;
                //len= input.length-1;

            }
        }
        return newInput;
    }

}
