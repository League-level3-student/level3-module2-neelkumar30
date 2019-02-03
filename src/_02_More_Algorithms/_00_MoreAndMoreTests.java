package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
	Algorithms run = new Algorithms();
	
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", run.multiply(10, 0));
	    assertEquals("10 x 10 = 100", run.multiply(10, 10));
	    assertEquals("8 x 11 = 88", run.multiply(8, 11));
	  }

	@Test
	  public void PrimeTest() {

	    assertTrue(run.isPrime(3));
	    assertTrue(run.isPrime(5));
	    assertTrue(run.isPrime(541));
	    assertFalse(run.isPrime(4));
	    assertFalse(run.isPrime(12));
	    assertFalse(run.isPrime(527));

	  }

	@Test
	  public void SquareTest() {

	    assertTrue(run.isSquare(4));
	    assertTrue(run.isSquare(144));
	    assertTrue(run.isSquare(64));
	    assertTrue(run.isSquare(10201));
	    assertTrue(run.isSquare(1));
	    assertFalse(run.isSquare(3));
	    assertFalse(run.isSquare(22));
	    assertFalse(run.isSquare(143));

	  }

	@Test
	  public void CubeTest() {

	    assertTrue(run.isCube(27));
	    assertTrue(run.isCube(216));
	    assertTrue(run.isCube(729));
	    assertTrue(run.isCube(1));
	    assertFalse(run.isCube(3));
	    assertFalse(run.isCube(22));
	    assertFalse(run.isCube(143));

	  }



}
