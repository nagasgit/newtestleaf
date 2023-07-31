<<<<<<< HEAD
package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

/*
=======
package july15;

import org.testng.Assert;
import org.testng.annotations.Test;

    /*
>>>>>>> e3f5046c4e330497d4f4079f77fc0ef9c1f0193f
    Given a string s consisting of only the characters 'a' and 'b',
    return true if every 'a' appears before every 'b' in the string.
    Otherwise, return false.

    Example 1:
    Input: s = "aaabbb"
    Output: true
    Explanation:
    The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
    Hence, every 'a' appears before every 'b' and we return true.

    Example 2:
    Input: s = "abab"
    Output: false
    Explanation:
    There is an 'a' at index 2 and a 'b' at index 1.
    Hence, not every 'a' appears before every 'b' and we return false.

    Example 3:
    Input: s = "bbb"
    Output: true
    Explanation:
    There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
     */
public class CheckAllAsBeforeBs {

    @Test
    public void test1()
    {
        boolean b = checkAsBeforeBs("aaabbb");
        Assert.assertEquals(b,true);
    }

    @Test
    public void test2()
    {
        boolean b = checkAsBeforeBs("abab");
        Assert.assertEquals(b,false);
    }

    @Test
    public void test3()
    {
        boolean b = checkAsBeforeBs("bbb");
        Assert.assertEquals(b,true);
    }
    public boolean checkAsBeforeBs(String str)
    {
        if (str.contains("ba"))
            return false;
        else return true;
        }

    }
