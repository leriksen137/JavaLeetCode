package com.leetcode.problems.problem72;

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
	public void testEditDistanceExample1() {
		String word1 = "horse";
		String word2 = "ros";
		int actual = s.minDistance(word1, word2);
		int expected = 3;
		assertEquals(expected, actual);
	}

	@Test
	public void testEditDistanceExample2() {
		String word1 = "intention";
		String word2 = "execution";
		int actual = s.minDistance(word1, word2);
		int expected = 5;
		assertEquals(expected, actual);
	}
}
