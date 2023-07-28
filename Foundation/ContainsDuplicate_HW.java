package newtestleaf.Foundation;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

public class ContainsDuplicate_HW {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
    Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true

        Pseudo Code:
        1) Get the integer array length
        2) Create an empty map
        3) For loop to traverse through each array index
        4) if key already contains the map then add the value
        5) else add it to the map with value 1
        6) if value for any of the index is >= 2 then return true
        7) else false
     */

    @Test
    public void test1(){
        boolean actual = containsDuplicate(new int[]{1, 2, 3, 1});
        Assert.assertEquals(actual,true);
    }

    @Test
    public void test2(){
        boolean actual = containsDuplicate(new int[]{1, 2, 3, 4});
        Assert.assertEquals(actual,false);
    }

    @Test
    public void test3(){
        boolean actual = containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        Assert.assertEquals(actual,true);
    }
    public boolean containsDuplicate(int[] input){

        int len = input.length;
        Map<Integer,Integer> chkDuplicate = new TreeMap<Integer,Integer>();
        for (int i = 0; i < len; i++)
        {
            chkDuplicate.put(input[i], chkDuplicate.getOrDefault(input[i], 0) + 1);
            if (chkDuplicate.get(input[i]) >= 2)
            {
                return true;
            }
        }
        return false;
    }
}
