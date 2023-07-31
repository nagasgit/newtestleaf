package newtestleaf.Foundation;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class MovingZerosAlternativeSolutions {

    // [1,0,3,0,12]

    @Test
    public void test1() {
        /* AssertJUnit.assertArrayEquals(Arrays.asList(1,3,12,0,0),movingZeros(new int[] {1,0,3,0,12}));*/
        List<Integer> actual = movingZeros(new int[]{1, 0, 3, 0, 13});
        Assert.assertEquals(actual, Arrays.asList(1, 3, 13, 0, 0));
    }

    @Test
    public void test2() {
        List<Integer> actual = movingZeros(new int[]{0});
        Assert.assertEquals(actual, Arrays.asList(0));
    }

    @Test
    public void test3() {
        List<Integer> actual = movingZeros(new int[]{2, 0, 0, 1, 9, 0, 7});
        Assert.assertEquals(actual, Arrays.asList(2, 1, 9, 7, 0, 0, 0));
    }

    public List<Integer> movingZeros(int[] input) {
        int len = input.length;
        int count = 0;

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            list.add(input[i]);
            if (input[i] == 0) {
                count++;
            }
        }
        //int size = list.size();
        list.removeAll(Arrays.asList(0));
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        return list;
    }
}
