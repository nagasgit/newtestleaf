package july15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LengthOfLastWord {


    /*
     * input -- string {" i am a good  "}
     * output --int
     * input.trim -- "i am goo d"
     * String res =""
     * for (int i=input.lenght-1 , i >=0 ; i--)
     * if (input.charAT[input.lenght-1] !="" )
     * res= res+input.charAT[i]  //doog

     * int n = res.lenght()
     *Input: s = "Hello World"
        Output: 5
        Explanation: The last word is "World" with length 5.
     *
     */

    @Test
    public void test1() {
        int actual = lengthofLastWord("Hello World");
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void test2() {
        int actual = lengthofLastWord("   fly me   to   the moon  ");
        Assert.assertEquals(actual, 4);
    }

    @Test
    public void test3() {
        int actual = lengthofLastWord("luffy is still joyboy");
        Assert.assertEquals(actual, 6);
    }

    public int lengthofLastWord(String str) {

        String s = str.trim();
        int strLen = s.length();
        int count = 0;
        //String result = "";

        for (int i = strLen - 1; i > 0; i--) {
            if (s.charAt(i) != ' ') {
                //result = result + s.charAt(i);
                count++;
            } else break;
        }

        return count;
    }
}
