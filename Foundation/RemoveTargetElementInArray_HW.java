package newtestleaf.Foundation;



import static org.junit.Assert.assertArrayEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class RemoveTargetElementInArray_HW {

    /*
        > 4. Remove the target element in the array>
        >    example 1: input = [2, 3, 3, 4, 5], target=3
        >               output = [2, 4, 5]
        >               explanation: when 3 is removed from input array,
        >                            output is [2, 4, 5]>
        >    example 2: input = [2, 2], target=2
        >               output = []
>            explanation: when 2 is removed, output would be empty array/

        Pseudo Code:
        - Get the two inputs (Int array and target value)
        - For loop to traverse through the array one by one till the array length
        - Create an empty set and add values to the set
        - If index value matches with n, then remove them from the set
        - return the set
     */

    @Test
    public void test1() {
        Object[] actual = removeTargetEle(new int[]{2, 3, 3, 4, 5}, 3);
        assertArrayEquals(actual, new Object[]{2, 4, 5});
    }

    @Test
    public void test2() {
        Object[] actual = removeTargetEle(new int[]{2, 2}, 2);
        assertArrayEquals(actual, new Object[]{});
    }

    @Test
    public void test3() {
        Object[] actual = removeTargetEle(new int[]{2, 3, 4, 5, 6, 0, 1}, 5);
        assertArrayEquals(actual, new Object[]{2, 3, 4, 6, 0, 1});
    }

    public Object[] removeTargetEle(int[] input, int n) {
        int len = input.length;
        Set<Integer> targetEle = new LinkedHashSet<Integer>();
        for (int i = 0; i < len; i++) {
            if (input[i] != n) {
                targetEle.add(input[i]);
            }
        }
        return targetEle.toArray();
    }
}
