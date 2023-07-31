package july8.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClaimbingStairs_additionallogic {

    @Test
    public void test1() {
        int actual = climbStairs(5);
        Assert.assertEquals(actual, 8);
    }
    public int climbStairs(int n) {
        if (n <= 0) {
            return 0; // Invalid input, no stairs to climb
        }

        if (n <= 2) {
            return n; // Base cases: 1 way for 1 stair, 2 ways for 2 stairs
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
