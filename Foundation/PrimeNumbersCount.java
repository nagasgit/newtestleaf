package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumbersCount {

    /*
     * 1 is a prime number
     * For loop to traverse from 2 to input
     * Another for loop to traverse from 2 to i/ 2
     * Check if j % i == 0, then continue the loop
     * else count++ and return count
     */

    @Test
    public void test1() {
        int actual = primeNumCount(11);
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void test2() {
        int actual = primeNumCount(2);
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void test3() {
        int actual = primeNumCount(0);
        Assert.assertEquals(actual, 0);
    }

    public int primeNumCount(int input) {
        //Input - 11
        int count = 0;
        int flag = 0;
        for (int i = 2; i <= input; i++)
        {
            flag = 0;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0) {
                    flag++;
                    continue;
                }
            }
            if (flag == 0) {
                count++;
            }

        }

        return count;
    }
}
