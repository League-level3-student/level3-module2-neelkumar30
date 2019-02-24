package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static String multiply(int a, int b) {
		int temp = a * b;
		return a + " x " + b + " = " + temp;
	}

	public static boolean isPrime(int a) {
		int root = (int) Math.sqrt(a);
		for (int i = 2; i < root + 1; i++) {
			int rem = a % i;
			if (rem == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSquare(int a) {
		double root = Math.sqrt(a);
		if (root == (int) root) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isCube(int a) {
		double root = Math.cbrt(a);
		if (root == (int) root) {
			return true;
		} else {
			return false;
		}
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String value = eggs.get(i);
			if (value == "cracked") {
				return i;
			} else {
				continue;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean value = oysters.get(i);
			if (value == true) {
				count++;
			} else {
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
			if (value > highest) {
				highest = value;
			} else {
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
			if (value > longest) {
				longest = value;
				longestWord = word;
			} else {
				continue;
			}
		}

		return longestWord;
	}

	public static boolean containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			String value = message1.get(i);
			if (value.contains("... --- ...")) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		double temp;
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					temp = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1, temp);
					swap = true;

				}

			}
		}
		return results;
		

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		String temp;
		boolean swap = true;
		while(swap) {
			swap = false;
			for(int i = 0; i<unsortedSequences.size()-1; i++) {
				String original = unsortedSequences.get(i);
				String comparing = unsortedSequences.get(i+1);
				if(original.length() > comparing.length()) {
					temp = original;
					original = comparing;
					comparing = temp;
					unsortedSequences.set(i, original);
					unsortedSequences.set(i+1, comparing);
					swap = true;
				}
			}
		}
		
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		String temp;
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int i = 0; i < words.size()-1; i++) {
				if(words.get(i).compareTo(words.get(i+1)) >0) {
					temp = words.get(i);
					words.set(i, words.get(i+1));
					words.set(i+1, temp);
					swap = true;
				}
			}
		}
		return words;
	}
}
