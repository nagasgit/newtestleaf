package July21_ClassWork;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class ValidAnagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise. An Anagram is a word or phrase formed by rearranging the letters
	 * of a different word or phrase, typically using all the original letters
	 * exactly once.
	 * 
	 * Example 1: Input: s = "anagram", t = "nagaram" Output: true Example 2:
	 * 
	 * Input: s = "rat", t = "car" Output: false
	 * 
	 * Pseudo Code: 1) Convert s and t to charArray 2) Create a new int[] array with
	 * the length of 26 as all the inputs in lowercase letters 3) for each loop to
	 * increment all the values in int[] array for all the s.tochararray() 4) for
	 * each loop to decrement all the values in int[] array for all the
	 * t.tochararray() 5) for loop to run from 0 to array length, and if any arr
	 * values is = -1 then return false 6) return true if there is no -1 in the
	 * array
	 */

	@Test
	public void test1() {
		boolean actual = validAnagram("anagram", "nagaram");
		Assert.assertEquals(actual, true);
	}

	@Test
	public void test2() {
		boolean actual = validAnagram("dot", "cat");
		Assert.assertEquals(actual, false);
	}

	public boolean validAnagram(String s, String t) {

		int[] arr = new int[26];
		for (char ch : s.toCharArray()) {
			// arr[ch-'a']++;
			System.out.println(arr[ch - 'a']++);
		}
		for (char ch : t.toCharArray()) {
			System.out.println(arr[ch - 'a']--);
			// arr[ch-'a']--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				// System.out.println(arr[i]);
				return false;
			}
		}

		return true;
	}

}
