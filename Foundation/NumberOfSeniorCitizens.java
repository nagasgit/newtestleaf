package july15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfSeniorCitizens {

    /*
    You are given a 0-indexed array of strings details. Each element of details provides information about a
    given passenger compressed into a string of length 15. The system is such that:
    The first ten characters consist of the phone number of passengers.
    The next character denotes the gender of the person.
    The following two characters are used to indicate the age of the person.
    The last two characters determine the seat allotted to that person.
    Return the number of passengers who are strictly more than 60 years old.

    Example 1:
    Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
    Output: 2
    Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40. Thus, there are 2 people who are over 60 years old.

    Example 2:
    Input: details = ["1313579440F2036","2921522980M5644"]
    Output: 0
    Explanation: None of the passengers are older than 60.
     */

    @Test
    public void test1()
    {
        int actual = numberOfSeniorCitizens(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"});
        Assert.assertEquals(actual,2);
    }

    @Test
    public void test2()
    {
        int actual = numberOfSeniorCitizens(new String[]{"1313579440F2036","2921522980M5644"});
        Assert.assertEquals(actual,0);
    }
    public int numberOfSeniorCitizens(String[] input)
    {
        int len = input.length;
        int count=0;
        for (int i = 0; i < len; i++)
        {
            String s = input[i].substring(11, 13);
            int age = Integer.parseInt(s);
            if (age > 60){
                count++;
            }
        }
        return count;
    }
}
