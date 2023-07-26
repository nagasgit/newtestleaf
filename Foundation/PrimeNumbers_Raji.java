package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumbers_Raji {

    @Test
    public void test() {
        Assert.assertEquals(primeNumbers(10), 4);
    }
    public int primeNumbers(int n)
    {
        int j = 2;
        int flag = 0;
        int count =0;
        while ( j <= n ) {
            flag = 0;// 2 <= 10
            for (int i = 2; i <= j / 2; i++)   // n = 10
            {
                if (j % i == 0)
                {
                    flag++;
                    continue;
                }
            }
                if (flag == 0){
                    count++;
                }
            j++;
            }
        return count;
    }

}
