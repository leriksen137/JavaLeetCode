package com.leetcode.problems.problem28;

import static org.junit.Assert.assertEquals;

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
		int actual = s.strStr(haystack, needle);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void testStrStrExampe2() {
		String haystack = "aaaaa";
		String needle = "bba";
		int actual = s.strStr(haystack, needle);
		int expected = -1;
		assertEquals(expected, actual);
	}
}
