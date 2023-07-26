package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Coins {

    /*
    You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins.
    The last row of the staircase may be incomplete.
     Given the integer n, return the number of complete rows of the staircase you will build.
     PseudoCode:
     1) Input - N of coins, remaining = n;
     //  n = 5, remaining = n, row = 0;
     2) For loop to traverse from i <= 5
     3) remaining = remaining - i
     //  remaining = 5 - 1;  ==> 4
     //  remaining = 4 - 2   ==> 2
     //  row++
     4) if (remaining < 0)
        {
        break;
        }

     */

    @Test
    public void test1()
    {
        int actual = noOfCoins(15);
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test2()
    {
        int actual = noOfCoins(2);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test3()
    {
        int actual = noOfCoins(0);
        Assert.assertEquals(actual,0);
    }
    public int noOfCoins(int n)
    {
        //int balance = n;
        int row = 0;
        //1,2,3,4,5,6

        for (int i = 1;i<= n; i++)
        {
            row++;
            n = n -i;
        }
        return row;
    }

}
