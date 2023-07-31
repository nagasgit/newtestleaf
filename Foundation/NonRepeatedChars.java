package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatedChars {

    @Test
    public void test1()
    {
        int actual = nonRepeatedChars(new int[]{2,2,1});
        Assert.assertEquals(actual,1);

    }

    @Test
    public void test2()
    {
        int actual = nonRepeatedChars(new int[]{4,1,2,1,2});
        Assert.assertEquals(actual,4);
    }

    @Test
    public void test3()
    {
        int actual = nonRepeatedChars(new int[]{2,3,4,2,3,4,1});
        Assert.assertEquals(actual,1);
    }
    public int nonRepeatedChars(int[] input) {

        int result = 0;
        Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < input.length; i++) {
            if (hMap.containsKey(input[i])) {
                hMap.put(input[i], hMap.get(input[i]) + 1);
            } else {
                hMap.put(input[i], 1);
            }
        }
        System.out.println(hMap.entrySet());
        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
