package newtestleaf.Foundation;


import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import junit.framework.Assert;

/*
Alice has n candies, where the ith candy is of type candyType[i].
Alice noticed that she started to gain weight, so she visited a doctor.
The doctor advised Alice to only eat n / 2 of the candies she has (n is always even).
Alice likes her candies very much, and she wants to eat the maximum number of
different types of candies while still following the doctor's advice.
Given the integer array candyType of length n, return the maximum number of different
types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies.
Since there are only 3 types, she can eat one of each type.

Example 2:
Input: candyType = [1,1,2,3]
Output: 2
Explanation: Alice can only eat 4 / 2 = 2 candies.
Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.

Example 3:
Input: candyType = [6,6,6,6]
Output: 1
Explanation: Alice can only eat 4 / 2 = 2 candies.
Even though she can eat 2 candies, she only has 1 type.*/
public class DistributeCandies {

    /*
    Pseudo Code:
    1) Get the integer array length
    2) Create an empty set
    3) For loop to add all the unique values to the Set
    4) if condition to check, if ((n/2) < uniqueSet.size) then return n/2;
    5) else if (n/2 > uniqueSet.size) then return uniqueSet.size
    5) else if (n/2 == uniqueSet.size) then return either of them.
     */
    //Input: candyType = [1,1,2,2,3,3]
    //Output: 3

    @Test
    public void test1()
    {
        int actual = distributeCandies(new int[]{1, 1, 2, 2, 3, 3,4,5,6,7});
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test2()
    {
        int actual = distributeCandies(new int[]{1,1,2,3});
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test3()
    {
        int actual = distributeCandies(new int[]{6,6,6,6});
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test4()
    {
        int actual = distributeCandies(new int[]{1,1});
        Assert.assertEquals(actual,1);
    }
    public int distributeCandies(int[] input) {
        int arrLen = input.length;

        Set<Integer> uniqueType = new TreeSet<Integer>();

        for (int i = 0; i < arrLen; i++) {
            uniqueType.add(input[i]);
        }

        int setSize = uniqueType.size();
        if ((arrLen / 2) > setSize)  //3 > 2
        {
            return setSize;
        } else if ((arrLen / 2) < setSize) {
            return (arrLen / 2);
        } else {
            return setSize;
        }

    }

}
