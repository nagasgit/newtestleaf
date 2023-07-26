package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class NumberOfOnes {

    /*
     * Get the Length of the array
     * For loop traverse through the array
     * if value is equals to 1 then count + 1
     * else continue the loop
     */

    @Test
    public void test1()
    {
        int i = numberOfOnes(new int[]{1,0,1,0,1,1,1});
        Assert.assertEquals(i, 5);
    }

    @Test
    public void test2()
    {
        Assert.assertEquals(numberOfOnes(new int[] {0,0,0}), 0);
    }

    @Test
    public void test3()
    {
        Assert.assertEquals(numberOfOnes(new int[] {0,-1,0}), 0);
    }
    public int numberOfOnes(int[] input){
        Arrays.sort(input);

        int length = input.length;
        int count = 0;

        //Input =  {0,1,0,1,1,1,1}
        //Input = Input =  {0,0,1,1,1,1,1}
        //length = 7

        for (int i = 0; i < length; i++)
        {
            if (input[i] != 0)
            {
               // count = count +1;
                count = length - i;
            }
           /* return count;*/
        }
        return count;
    }


}
