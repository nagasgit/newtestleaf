package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class IsoGram {

    //Problem Stmt: String which does not have any repeating characters

    /*Pseudocode
     * Convert the string to a char-array
     * Traverse through the string length
     * if char-array[index] matches with the rest of the character in the string
     * if matches, return false (string is not isogram)
     * if it does not match then string is isogram
     */

    @Test
    public void test1()
    {
        boolean actual = isoGram("tesTlf");
        Assert.assertEquals(actual,true);
    }

    @Test
    public void test2()
    {
        boolean actual = isoGram("who r u");
        Assert.assertEquals(actual,false);
    }

    @Test
    public void test3()
    {
        boolean actual = isoGram("Ii");
        Assert.assertEquals(actual,true);
    }
    public boolean isoGram(String input){
            //Example - TestLeaf
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length - 1; i++)
        {
            for (int j =i+1; j < chars.length; j++)
            {
                if (chars[i] == chars[j])
                {
                    return false;
                }
            }
        }
        return true;
    }

}
