package com.leetcode.problems.problem5;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 5, problemName = "Longest Palindromic Substring")
public class Solution {
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
}