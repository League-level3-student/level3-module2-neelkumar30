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
		for (int i = 0; i < eggs.size(); i++) {
			String value = eggs.get(i);
			if(value == "cracked") {
				return i;
			}
			else {
				continue;
			}
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean value = oysters.get(i);
			if(value == true) {
				count++;
			}
			else {
				continue;
			}
		}
		return count;
	}
	public static double findTallest(List<Double> peeps) {
		double highest = 0;
		double first = peeps.get(0);
		highest = first;
		for (int i = 0; i < peeps.size(); i++) {
			double value = peeps.get(i);
			if(value > highest) {
				highest = value;
			}
			else {
				continue;
			}
		}
		return highest;

	}
	public static String findLongestWord(List<String> words) {
		int longest = 0;
		String temp = words.get(0);
		int first = temp.length();
		longest = first;
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			String word = words.get(i);
			int value = word.length();
			if(value > longest) {
				longest = value;
				longestWord = word;
			}
			else {
				continue;
			}
		}
		
		return longestWord;
	}
	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			String value = message1.get(i);
			if(value.contains("... --- ...")) {
				return true;
			}
			else {
				continue;
			}
		}
		return false;
	}
	
}
