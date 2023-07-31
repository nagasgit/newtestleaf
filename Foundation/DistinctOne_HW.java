package newtestleaf.Foundation;


import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

/*
Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.

Example 1:
Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

Pseudo Code:
 - Get the array length
 - Create an empty map
 - For loop to traverse through each index till array length
 - Get the count of each occurances and if any occurance is equals to 1, then
   return the number

 */
public class DistinctOne_HW {

    @Test
    public void test1() {
        Integer[] actual = distinctOne(new int[]{2, 2, 1});
        Assert.assertEquals(actual,new Integer[] {1});
       // Assert.assertEquals(actual, );
    }

    @Test
    public void test2() {
        Integer[] actual = distinctOne(new int[]{4, 1, 2, 1, 2});
        Assert.assertEquals(actual, new Integer[] {4});
    }

    @Test
    public void test3() {
        Integer[] actual = distinctOne(new int[]{1});
        Assert.assertEquals(actual, new Integer[] {1});
    }

    public Integer[] distinctOne(int[] input)
    {
        int len = input.length;
        Map<Integer, Integer> distinctVal = new TreeMap<Integer, Integer>();
         int i;
        for (i = 0; i < len; i++) {
            distinctVal.put(input[i], distinctVal.getOrDefault(input[i], 0) + 1);
        }
          int size = distinctVal.size();

        //Collection<Integer> values = distinctVal.values();
        //Set<Integer> set = distinctVal.keySet();

        Set<Map.Entry<Integer, Integer>> entries = distinctVal.entrySet();

        for (Map.Entry<Integer,Integer> val: entries)
        {
            if (val.getValue() == 1){
                int key = val.getKey();
                return new Integer[]{key};

            }
        }

        return new Integer[]{0};
    }
}
