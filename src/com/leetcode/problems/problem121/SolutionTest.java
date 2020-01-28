package com.leetcode.problems.problem121;

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
	public void testMaxProfitExample1() {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		int actual = s.maxProfit(prices);
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Test
	public void testMaxProfitExample2() {
		int[] prices = new int[] { 7, 6, 4, 3, 1 };
		int actual = s.maxProfit(prices);
		int expected = 0;
		assertEquals(expected, actual);
	}
}
