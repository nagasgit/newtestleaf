package newtestleaf.Foundation;

public class SingleNumber_incomp {

    /*
    Given a non-empty array of integers nums, every element appears twice except for one.
    Find that single one. You must implement a solution with a linear runtime complexity
    and use only constant extra space.

    Example 1:
    Input: nums = [2,2,1]
    Output: 1

    Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4

    Example 3:
    Input: nums = [1]
    Output: 1
     */

    public int singleNumber(int[] input)
    {
        //Declare a variable and find out a length
        int len = input.length;
        int count = 1;
        // for loop to traverse through the array
        for (int i = 0; i < len; i++)
        {
            count = 0;
            //for loop to check each elements and its occurances
            for (int j = i+1; j < len; j++)
            {
                //if condition to check the two elements in loop
                if (input[i] == input[j])   //[2,2,1]
                {
                    //counter variable to count the occurances of the element
                    count++;
                }
            }
            if (count > 1)
            {
                return input[i];
            }
        }
        return 0;
    }

}
