package newtestleaf.Foundation;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNoOfOccurances {

	/*
	 * Given an array of integers arr, return true if the number of occurrences of
	 * each value in the array is unique or false otherwise.
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [1,2,2,1,1,3] Output: true Explanation: The value 1 has 3
	 * occurrences, 2 has 2 and 3 has 1. No two values have the same number of
	 * occurrences. Example 2:
	 * 
	 * Input: arr = [1,2] Output: false Example 3:
	 * 
	 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0] Output: true
	 * 
	 * Pseudo Code: 1) Get the Integer arr and find out the length of it 2) Create a
	 * empty map 3) for loop to traverse and add all the values into array map 4)
	 * Check if any value is > 1 then return false
	 */
	
	@Test
	public void test1()
	{
		boolean actual = uniqueNoOfOccurances(new int[] {1,2});
		Assert.assertEquals(actual,false);
	}
	
	@Test
	public void test2()
	{
		boolean actual = uniqueNoOfOccurances(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(actual,true);
	}
	
	@Test
	public void test3()
	{
		boolean actual = uniqueNoOfOccurances(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(actual,true);
	}

	public boolean uniqueNoOfOccurances(int[] arr) 
	{
		int len = arr.length;
		Map<Integer, Integer> uniqueOcc = new TreeMap<Integer, Integer>();

		for(int i =0; i< len; i++) {
			uniqueOcc.put(arr[i], uniqueOcc.getOrDefault(arr[i], 0) + 1);
			// if (uniqueOcc.)
			// uniqueOcc.getOrDefault(arr, null)
		}
		Set<Integer> uniqueSet = new LinkedHashSet<Integer>(uniqueOcc.values());
		if (uniqueOcc.size() != uniqueSet.size())
			return false;
		else
		/*
		 * uniqueOcc.size(); Set<Entry<Integer, Integer>> entrySet =
		 * uniqueOcc.entrySet(); Collection<Integer> values = uniqueOcc.values();
		 * for(int i = 0; i < uniqueOcc.size();i++) {
		 * 
		 * }
		 */
		/*
		 * Set<Entry<Integer, Integer>> entrySet = uniqueOcc.entrySet();
		 * System.out.println(entrySet); for (Entry<Integer, Integer> entry : entrySet)
		 * { if (entry.getValue() > 1) { return false; } }
		 */

		return true;
	}

}
