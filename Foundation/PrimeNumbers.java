package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeNumbers {

    /*
     * Input number divide by 2, get the quotient
     * assign the quotient value to a int variable
     * Traverse the loop from 2 to the quotient value
     * Check if the reminder is not equal to 0 then return the n as prime
     * else return n is not a prime number
     */

    @Test
    public void test1(){
      //  Assert.assertEquals("number is not prime number",primeNumberOrNot(31));

        Assert.assertEquals(primeNumberOrNot(31),"number is a prime number");
    }

    @Test
    public void test2(){
        //  Assert.assertEquals("number is not prime number",primeNumberOrNot(31));

        Assert.assertEquals(primeNumberOrNot(15),"number is not a prime number");
    }

    @Test
    public void test3(){
        //  Assert.assertEquals("number is not prime number",primeNumberOrNot(31));

        Assert.assertEquals(primeNumberOrNot(99),"number is not a prime number");
    }

    public String primeNumberOrNot(int n)
    {
        int val = n / 2;
        for (int i = 2; i <= val; i++)
        {
            if (n % i != 0)
            {
                continue;
            }
                return "number is not a prime number";

        }
        return "number is a prime number";
    }

}
