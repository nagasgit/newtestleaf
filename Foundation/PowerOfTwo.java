package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo {

    @Test
    public void test1() {
        boolean actual = powerOfTwo(10);
        Assert.assertEquals(actual, false);
    }

    @Test
    public void test2() {
        boolean actual = powerOfTwo(16);
        Assert.assertEquals(actual, true);
    }

    public boolean powerOfTwo(int n) {
        while (n % 2 == 0)
        {
            n = n / 2;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }

}
