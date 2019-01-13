package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	_00_LinearSearch ls = new _00_LinearSearch();
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
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
