package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class uniqueOccuranceOfGivenIntArray {

    /*  // 1,2,3,4,1,2  ---> 1 - 2, 2 - 2, 3 - 1, 4 - 1
     * Get the Length of integer array
     * Create an empty map
     * Traverse through the for loop
     * if map contains the index value, get the count of value
     * add it to the map and assign the count
     * if the map contains any duplicate values then return false
     * else return true
     */
    @Test
    public void test1(){
        boolean expected = uniqueOccarances(new int[]{1, 2, 3, 2, 1, 1});
        Assert.assertEquals(true,expected);
    }

    public boolean uniqueOccarances(int[] array) {
        //Input - 1,2,3,2,1,2,2
        //Input: arr = [1,2,2,1,1,3]
        int length = array.length;

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(array[i])) {
                int val = map.get(array[i]) + 1;

            } else {
                map.put(array[i], 1);
                // 1 - 2, 2 - 4, 3 - 1,
            }
            int mapSize = map.size();
            Set<Integer> set = new TreeSet<Integer>(map.values());
            int setSize = set.size();
            if (mapSize == setSize){
                return true;
            }else
                return false;

        }
        return false;
    }


}
