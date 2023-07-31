package july8.day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedCharArray {

         /* Prob Stmt
         - Given a sorted character array and target character,
         find the next biggest char in the arrray */

    @Test
    public void test1()
    {
        char[] c = {'a','d','f'};
        char actual = sortedChar(c, 'e');
        Assert.assertEquals(actual,'f');
    }

    @Test
    public void test2()
    {
        char[] c = {'a','e','g','i','j','x','z'};
        char actual = sortedChar(c, 'm');
        Assert.assertEquals(actual,'x');
    }

    @Test
    public void test3()
    {
        char[] c = {'a','e','g','i','j','x','z'};
        char actual = sortedChar(c, '1');
        Assert.assertEquals(actual,'a');
    }

    @Test
    public void test4()
    {
        char[] c = {};
        char actual = sortedChar(c, 's');
        Assert.assertEquals(actual,'s');
    }
    public char sortedChar(char[] chars, char targetChar)
    {
        int len = chars.length;
        for (int i = 0; i < len; i++)
        {
            if (targetChar > chars[i])
            {
                continue;
            }else {
                return chars[i];
            }
        }
        return targetChar;
    }
}
