package july8.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SingleNumber {


    /*
    Pseudo Code:
     1) Create an empty map
     2) For loop to traverse through the array and add key and value to the map
     3) increment the occurances using getordefault methods in map
     4) if condition to check any of the key value == 1
     5) return the key
     */

    @Test
    public void test1()
    {
        int actual = singleNumber(new int[]{2, 2, 1});
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test2()
    {
        int actual = singleNumber(new int[]{1,2,1,4,2});
        Assert.assertEquals(actual,4);
    }

    @Test
    public void test3()
    {
        int actual = singleNumber(new int[]{1});
        Assert.assertEquals(actual,1);
    }
    @Test
    public void test4()
    {
        int actual = singleNumber(new int[]{1,1});
        Assert.assertEquals(actual,0);
    }
    public int singleNumber(int[] input)
    {
        int len = input.length;
        Map<Integer,Integer> count = new TreeMap<Integer,Integer>();

        for (int i = 0; i < len; i++)
        {
            count.put(input[i],count.getOrDefault(input[i],0)+1);
        }
        //count.size();
        System.out.println(count);
        Set<Map.Entry<Integer, Integer>> values = count.entrySet();

        for (Map.Entry<Integer,Integer> val: values)
        {
            if (val.getValue() == 1){
                Integer actual = val.getKey();
                return actual;
            }
        }

        return 0;
    }

}
