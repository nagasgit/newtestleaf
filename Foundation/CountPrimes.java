package newtestleaf.Foundation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CountPrimes {
	
	/*
	 * Given an integer n, return the number of prime numbers that are strictly less than n.
		Example 1:	
		Input: n = 10
		Output: 4
		Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
		
		Example 2:
		Input: n = 0
		Output: 0
		
		Example 3:
		Input: n = 1
		Output: 0
		
		Pseudo Code:
		1) Get the input n, initialize the count variable as 0
		2) while n > 1
		3) for(int i = 2; i <= n/2; i++)
		4) if ( n % i == 0) count++
		5) Outer For loop, check if count == 0, add i to the list and n--;
	 */
	
	@Test
	public void test1()
	{
		int actual = countPrimes(10);
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void test2()
	{
		int actual = countPrimes(0);
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void test3()
	{
		int actual = countPrimes(0);
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void test4()
	{
		int actual = countPrimes(20);
		Assert.assertEquals(actual, 8);
	}
	
	public int countPrimes(int n) {
		int count = 0;
		int primeCnt = 0;
		int len = n/2;
		while (n-1 >1)
		{
			count =0;
			for (int i = 2; i < n/2; i++)
			{
				if (n % i == 0)
				{
					count++;
					break;
				}
			}
			//List<Integer> primeNos = new ArrayList<Integer>();
			if (count == 0)
			{
				primeCnt++;
			}
			n--;
		}
		
		return primeCnt;
		
	}

}
