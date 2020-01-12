package com.leetcode.problems.problem28;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 28, problemName = "Implement strStr()")
public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < haystack.length(); i++) {
			for (int j = 0; j < needle.length() && i + j < haystack.length()
					&& haystack.charAt(i + j) == needle.charAt(j); j++) {
				if (j == needle.length() - 1) {
					return i;
				}
			}
		}
		return -1;
	}
}