package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class StringAlike {

    /*
    You are given a string s of even length. Split this string into two halves of equal lengths,
    and let a be the first half and b be the second half. Two strings are alike if they have the
    same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
    Notice that s contains uppercase and lowercase letters. Return true if a and b are alike.
    Otherwise, return false.
    Example 1:
    Input: s = "book"
    Output: true
    Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
    Example 2:
    Input: s = "textbook"
    Output: false
    Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
    Notice that the vowel o is counted twice.

    Pseudo Code:
    1) Get the String and find the string length and split it in /2
    2) Str1 and Str2
    3) Str3 = {vowels}
    4) for loop to traverse from 0 to str1 length, to get the count of vowels
    5) for loop 2 to traverse from 0 to str2 length, to get the count of vowels
    6) return true or false

    i = String.length


     */

    @Test
    public void test1() {
        boolean c = shuffleString("book");
        Assert.assertEquals(c, true);
    }

    @Test
    public void test2() {
        boolean c = shuffleString("helloo");
        Assert.assertEquals(c, false);
    }

    public boolean shuffleString(String str) {
        int acount = 0;
        int bcount = 0;
        int len = str.length();
        String a = str.substring(0, str.length() / 2);
        String b = str.substring(str.length() / 2, len);
        String s = a.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
        s.length();
        String s1 = b.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "");
        s1.length();

        if (s.length() != s1.length())
        {
            return false;
        } else {
            return true;
        }

       /*

        char[] chars = a.toCharArray();
        char[] chars1 = b.toCharArray();
        char[] vowals = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String vowls = String.valueOf(vowals);

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowals.length; j++)
                if (chars[i] == vowals[j]) {
                    acount++;
                }
        }
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < vowals.length; j++)
                if (chars1[i] == vowals[j]) {
                    bcount++;
                }
        }

        if (acount == bcount)
            return true;
        else {
            return false;
        }*/
        //return false;
    }
}
