package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	_00_LinearSearch ls = new _00_LinearSearch();
	_01_BinarySearch bs = new _01_BinarySearch();
	_02_InterpolationSearch is = new _02_InterpolationSearch();
	_03_ExponentialSearch es = new _03_ExponentialSearch();
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String [] test1 = {"Aaron", "Rodgers", "Mesut", "Ozil", "Rafael", "Nadal", "Big", "Shaq"};
		String [] test2 = {"Steph", "Curry"};
		String [] test3 = {"Philip", "Rivers", "Easy", "Money"};
		assertEquals(3, ls.linearSearch(test1,"Ozil"));
		assertEquals(-1, ls.linearSearch(test2,"Ozil"));
		assertEquals(1, ls.linearSearch(test3,"Rivers"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int [] test1 = {1,2,3,4,5,65,};
		int [] test2 = {18,28,2832};
		int [] test3 = {1232,213213,812080480};
		assertEquals(2, bs.binarySearch(test1,0,3,3));
		assertEquals(-1, bs.binarySearch(test2,0,2,38));
		assertEquals(2, bs.binarySearch(test3,0,2,812080480));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int [] test1 = {1,2,3,4,5,6,};
		int [] test2 = {6, 12, 18, 24, 30};
		int [] test3 = {2,4,6};
		assertEquals(-1, is.interpolationSearch(test1, 18));
		assertEquals(2, is.interpolationSearch(test2, 18));
		assertEquals(0, is.interpolationSearch(test3, 2));
	}
	
	@Test
	public void testExponentialSearch() {
		int [] test1 = {1,2,3,4,5,62131235,};
		int [] test2 = {18,2828,2832};
		int [] test3 = {1232,2132133,812080480};
		assertEquals(2, es.exponentialSearch(test1,3));
		assertEquals(-1, es.exponentialSearch(test2,38));
		assertEquals(2, es.exponentialSearch(test3,812080480));
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
