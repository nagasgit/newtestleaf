package july1st.breakoutsession.program;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Map;
import java.util.TreeMap;

public class Array_MajorityElement {

    /* PseudoCode -
     * Find out the length of the array
     * Create an integer variable and assign the value (length of array / 2)
     * Create a map
     * Traverse through all the array values and put it to Map
     * if map.get(each array values) > (length of array / 2)
     * then return the value as majority element
     */

    @Test
    public void test1(){
        Assert.assertEquals(3, majorityEleInArrar(new int[] {3,2,3,2,3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(0, majorityEleInArrar(new int[] {3,2,3,2,1}));
    }

    @Test
    public void test3(){
        Assert.assertEquals(0, majorityEleInArrar(new int[] {3,2}));
    }

    public int majorityEleInArrar(int[] nums){
        int len = (nums.length)/2;
        Map<Integer,Integer> majorityEle = new TreeMap<Integer,Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            majorityEle.put(nums[i],majorityEle.getOrDefault(nums[i],0)+1);
            if (majorityEle.get(nums[i]) > len)
            {
                return nums[i];

            }else{
                continue;
            }

        }
        /*for (int j=0; j < majorityEle.size(); j++)
        {
            if (majorityEle.get(j) > len){
                return majorityEle[j];
            } else {
                continue;
            }
        }*/
        /*int size = majorityEle.size();
        for (int j= 0; j < size; j++)
        {
            if (majorityEle[j] > len){

            }
        }*/


        return 0;
    }
}
