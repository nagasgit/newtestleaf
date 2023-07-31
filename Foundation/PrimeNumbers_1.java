package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumbers_1 {

    /* Pseudo Code
     * While loop to check the value (n) is greater than 1
     * For loop to traverse from number 2 to n / 2
     * Get the remainder of n % i, and assign it to remainder.
     * Create a int variable (flag) with 0  --> flag = 0
     * if remainder is equals to 0 then increment flag++ and break the loop.
     * once entire for loop runs, check if the flag is 0.
       if flag is 0 then save the n value to new str variable (result)
     * if flag is not equals to 0 then n-- and continue the loop till while n > 1
     * return the result
     **
     */

    @Test
    public void test1() {
        int prime = Integer.parseInt(isPrime(10));
        Assert.assertEquals(prime, 7532);
    }

    @Test
    public void test2() {
        int prime = Integer.parseInt(isPrime(15));
        Assert.assertEquals(prime, 13117532);
    }

    @Test
    public void test3() {
        int prime = Integer.parseInt(isPrime(29));
        Assert.assertEquals(prime, 325);
    }

    public static String isPrime(int n) {
        int flag = 0;
        int remainder = 1;
        String nums = "";
        while (n > 1) {
            flag = 0;
            for (int i = 2; i <= n / 2; i++) {
                remainder = n % i;
                if (remainder == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                nums = nums + n + "";
                //int j = Integer.parseInt(nums);
            }
            n--;
        }
        return nums;
    }
}