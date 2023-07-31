<<<<<<< HEAD
package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;
=======
package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;
>>>>>>> e3f5046c4e330497d4f4079f77fc0ef9c1f0193f

public class CoinsAlternativeSolutions {
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14
    //15

    @Test
    public void test1()
    {
        int actual = coinsRowCount(15);
        Assert.assertEquals(actual,5);
    }

    @Test
    public void test2()
    {
        int actual = coinsRowCount(2);
        Assert.assertEquals(actual,1);
    }

    @Test
    public void test3()
    {
        int actual = coinsRowCount(6);
        Assert.assertEquals(actual,3);
    }
    public int coinsRowCount(int coins) {
        int row = 1;
        //int i = 1;
        while (coins > 0) {   //coins = 15,14>0,12>0, 9>0, 5>0
            row++;            //row = 1,2,3,4,5
            coins = coins - row; // 14,12,9,5,0
            //i++;               // 2,3,4,5,6
        }
        return row - 1;
    }

}
