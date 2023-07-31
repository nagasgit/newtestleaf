package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class LengOfTheLastWord_Recomm {

    @Test
    public void test1() {
        int actual = lengthOfLastString("Hello World");
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void test2() {
        int actual = lengthOfLastString("   fly me   to   the moon  ");
        Assert.assertEquals(actual, 4);
    }

    @Test
    public void test3() {
        int actual = lengthOfLastString("luffy is still joyboy");
        Assert.assertEquals(actual, 6);
    }
    public int lengthOfLastString(String str)
    {

        return str.trim().length() - str.trim().lastIndexOf(' ')-1;
    }


}
