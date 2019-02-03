package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static String multiply(int a, int b) {
		int temp = a *b;
		return a + " x " + b + " = " + temp;
	}
	public static boolean isPrime(int a) {
		int root = (int) Math.sqrt(a);
		for (int i = 2; i < root+1; i++) {
			int rem = a%i;
			if(rem == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isSquare(int a) {
		double root =Math.sqrt(a);
		if(root == (int) root) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isCube(int a) {
		double root =Math.cbrt(a);
		if(root == (int) root) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int findBrokenEgg(List<String> eggs) {
		return 0;
	}
}
