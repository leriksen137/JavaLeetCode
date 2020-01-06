package leetcode.problems;

import leetcode.template.LeetCode;

/**
 * Solution to <a href=
 * "https://leetcode.com/problems/longest-palindromic-substring/">Longest
 * Palindromic Substring</a>
 * 
 * @author leriksen137
 */
public class Problem5 implements LeetCode {
	// this should run in O(n);
	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return "";
		}

		String solution = "" + s.charAt(0);
		int start, end, palindromeLength;

		// check for odd sized palindrome
		for (int center = 0; center < s.length(); center++) {
			start = center;
			end = center + 1;
			palindromeLength = 1;
			// grow while there is still room to grow
			while (start > 0 && end < s.length()) {
				start--;
				end++;
				if (s.charAt(start) == s.charAt(end - 1)) {
					palindromeLength = palindromeLength + 2;
					if (palindromeLength > solution.length()) {
						solution = s.substring(start, end);
					}
				} else {
					break;
				}
			}
		}

		// look for even sized palindromes
		for (int offCenter = 1; offCenter < s.length(); offCenter++) {
			start = offCenter - 1;
			end = offCenter + 1;
			palindromeLength = 0;

			// grow while there is still room to grow
			while (start >= 0 && end <= s.length()) {
				if (s.charAt(start) == s.charAt(end - 1)) {
					palindromeLength = palindromeLength + 2;
					if (palindromeLength > solution.length()) {
						solution = s.substring(start, end);
					}
				} else {
					break;
				}
				start--;
				end++;
			}
		}
		return solution;
	}

	@Override
	public void run() {
		String s = "943827baab";

		String solution = longestPalindrome(s);

		assert solution.equals("bab") : "Returned wrong substring";
	}

	// This method works but is too inefficient.
	public String longestPalindromeQuadraticTime(String s) {
		int longestPalindromeLength = 0;
		String solution = "";
		String substring;
		if (s.length() == 1) {
			return s;
		}
		for (int start = 0; start < s.length() - 1; start++) {
			for (int end = start; end < s.length(); end++) {
				substring = s.substring(start, end + 1);
				if (isPalindrome(substring)) {
					if (substring.length() > longestPalindromeLength) {
						longestPalindromeLength = substring.length();
						solution = substring;
					}
				}
			}
		}
		return solution;
	}

	private static boolean isPalindrome(String string) {
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		String reversedString = sb.toString();
		return (string.equals(reversedString));
	}
}