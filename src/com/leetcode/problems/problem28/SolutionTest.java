package com.leetcode.problems.problem28;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	Solution s;

	@Before
	public void initializeSolution() {
		s = new Solution();
	}

	@Test
	public void testStrStrExampe1() {
		String haystack = "hello";
		String needle = "ll";
		int solution = s.strStr(haystack, needle);
		assertTrue(solution == 2);
	}

	@Test
	public void testStrStrExampe2() {
		String haystack = "aaaaa";
		String needle = "bba";
		int solution = s.strStr(haystack, needle);
		assertTrue(solution == -1);
	}
}
