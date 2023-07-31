package newtestleaf.Foundation;


import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class RamyaProg {

    @Test
    public void test(){
        Assert.assertEquals(ramya_Prog(new int[] {4,6,1,1,6}),4);
    }
    public int ramya_Prog(int[] input) {
        //Input [4,3,1,3,4]
        int count = 0;
        Arrays.sort(input);
        int len = input.length;
        for (int i = 0; i < input.length; i++) {
            //count= 0;
            for (int j = i + 1; j <= input.length - 1; j++) {
                if (input[i] == input[j])   // 1,1,4,6,6
                {
                    count++;
                }
            }

        }
        return input[len-1];
    }
}
