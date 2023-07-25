package july15_hwprograms;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class IntersectionOfTwoArrays {

	/*
	 * Given two integer arrays nums1 and nums2, return an array of their
	 * intersection. Each element in the result must be unique and you may return
	 * the result in any order.
	 * 
	 * Example 1: Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2] Example 2:
	 * 
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4] Explanation: [4,9]
	 * is also accepted.
	 * 
	 * Pseudo Code: 1) Create two set for num1 and num2 2) Add all the unique
	 * numbers of num1 3) Add number from set1 to set2 if it exists in set2. if
	 * set1.contains(num) in set2 4) Initialize an array with the size of set2 and
	 * add them
	 */

	@Test
	public void test1() {
		int[] actual = intersectionOfArrays(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2 });
		assertArrayEquals(actual, new int[] { 2 });
	}

	@Test
	public void test2() {
		int[] actual = intersectionOfArrays(new int[] { 4, 9, 5 }, new int[] { 9, 4, 9, 8, 4 });
		assertArrayEquals(actual, new int[] { 9, 4 });
	}

	public int[] intersectionOfArrays(int[] num1, int[] num2) {

		Set<Integer> arr1 = new LinkedHashSet<Integer>();
		for (int num : num1) {
			arr1.add(num);
			System.out.println(arr1);
		}

		Set<Integer> arr2 = new LinkedHashSet<Integer>();
		for (int num : num2) {
			if (arr1.contains(num))
				arr2.add(num);
			System.out.println(arr2);
		}

		int[] result = new int[arr2.size()];
		int i = 0;
		for (int num : arr2) {
			result[i] = num;
			i++;
		}
		return result;
	}

}
