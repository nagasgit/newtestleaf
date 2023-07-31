<<<<<<< HEAD
package newtestleaf.Foundation;

import org.junit.Test;

import junit.framework.Assert;
=======
package july8.day2;

import org.testng.Assert;
import org.testng.annotations.Test;
>>>>>>> e3f5046c4e330497d4f4079f77fc0ef9c1f0193f

public class CountOfMatches {

    /* Problem Statement
    You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team.
A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament,
and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams
advance to the next round. Return the number of matches played in the tournament
until a winner is decided.

Example 1:

Input: n = 7
Output: 6
Explanation: Details of the tournament:
- 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
- 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 3 + 2 + 1 = 6.
Example 2:

Input: n = 14
Output: 13
Explanation: Details of the tournament:
- 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
- 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
- 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
- 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
Total number of matches = 7 + 3 + 2 + 1 = 13.

     */
    /*
    Pseudo Code:
    1) Input - Get the n (teams) value
    2) Declare three variables to count teams, matches and total
    3) while to check whether the team count is odd or even
    4) if its odd, then teams = (n/2) + 1;
    5) if its even, then teams = n/2;
    6) count the total matches in each iteration (n/2)
    7) return total
    */

    @Test
    public void test1() {
        int actual = countofTotalMatches(15);
        Assert.assertEquals(actual, 14);
    }

    @Test
    public void test2() {
        int actual = countofTotalMatches(16);
        Assert.assertEquals(actual, 15);

    }

    @Test
    public void test3() {
        int actual = countofTotalMatches(19);
        Assert.assertEquals(actual, 18);

    }

    public int countofTotalMatches(int n) {
        int teams = 0;
        int matches = 0;
        int total = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                total = total + n;
            } else {
                n = ((n - 1) / 2) + 1;
                total = total + (n-1);
            }
            //return total;
        }

        return total;
    }
}
