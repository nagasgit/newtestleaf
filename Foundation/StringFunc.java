package newtestleaf.Foundation;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class StringFunc
{
    /*
     * Create an output list
     * Traverse from index 1 to n value
     * if the value n is divisible by 3 and 5, add Fizzbuzz to output
     * if the value divisible only 3, add Fizz to the output
     * if the value divisible only 5, return buzz
     * if not divisble by 3 or 5, then return the i value as a string
     */

    @Test
    public void test1()
    {
        //List<String> list = fizzbuzz(3);
        //System.out.println(list);

        List<String> expected = Arrays.asList(new String[]{"1", "2", "Fizz"});
        Assert.assertEquals(expected,fizzBuzz(3));
    }

    @Test
    public void test2()
    {
        List<String> expected = Arrays.asList(new String[]{"1", "2", "Fizz","4","Buzz"});
        Assert.assertEquals(expected,fizzBuzz(5));
    }
    public List<String> fizzBuzz(int n)
    {
        //String[] output;
        List<String> str = new ArrayList<String>();
        for (int i =1; i <= n; i++)
        {
            if (( i % 3 == 0) && (i % 5 == 0))
            {
                str.add("FizzBuzz");
            } else if (i % 3 == 0){
                str.add("Fizz");
            } else if (i % 5 ==0){
                str.add("Buzz");
            }else {
                //str.add(String.valueOf(i)); or below
                str.add(Integer.toString(i));
            }
        }
        return str;
    }
}
