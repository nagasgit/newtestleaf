package july15_hwprograms;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class PivotIndex {

	/*
	 * Given an array of integers nums, calculate the pivot index of this array. The
	 * pivot index is the index where the sum of all the numbers strictly to the
	 * left of the index is equal to the sum of all the numbers strictly to the
	 * index's right. If the index is on the left edge of the array, then the left
	 * sum is 0 because there are no elements to the left. This also applies to the
	 * right edge of the array. Return the leftmost pivot index. If no such index
	 * exists, return -1.
	 * 
	 * Example 1: Input: nums = [1,7,3,6,5,6] Output: 3 Explanation: The pivot index
	 * is 3. Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 Right sum =
	 * nums[4] + nums[5] = 5 + 6 = 11
	 * 
	 * Example 2: Input: nums = [1,2,3] Output: -1 Explanation: There is no index
	 * that satisfies the conditions in the problem statement.
	 * 
	 * Example 3: Input: nums = [2,1,-1] Output: 0 Explanation: The pivot index is
	 * 0. Left sum = 0 (no elements to the left of index 0) Right sum = nums[1] +
	 * nums[2] = 1 + -1 = 0
	 * 
	 * Pseudo Code: 1) Get the int[] array 2) Sum the total of all array values 3)
	 * Initialize the variable leftcum with 0 4) for loop to traverse from 0 to nums
	 * length 5) initialize the variable rightsum ==> total - leftsum - nums[i] 6)
	 * if leftsum == rightsum then return i is the pivot index 7) else leftsum =
	 * leftsum + nums[i]
	 * 
	 */
	
	@Test
	public void test1()
	{
		int actual = pivotIndex(new int[] {1,7,3,6,5,6});
		Assert.assertEquals(actual, 3);
		
	}
	
	@Test
	public void test2()
	{
		int actual = pivotIndex(new int[] {1,2,3});
		Assert.assertEquals(actual, -1);
		
	}
	
	@Test
	public void test3()
	{
		int actual = pivotIndex(new int[] {2,1,-1});
		Assert.assertEquals(actual, 0);
		
	}

	public int pivotIndex(int[] nums) {

		int totalSum = 0;
		int leftSum = 0, rightSum = 0;
		for (int num : nums) {
			totalSum = totalSum + num;
		}

		for (int i = 0; i < nums.length; i++) {

			rightSum = totalSum - leftSum - nums[i];
			if (leftSum == rightSum) {
				return i; // i is the pivot index
			}
			leftSum = leftSum + nums[i];
		}

		return -1;
	}

}
