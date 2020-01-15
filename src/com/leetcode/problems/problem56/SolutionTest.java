package com.leetcode.problems.problem56;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

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
	public void testMergeIntervalsExample1() {
		int[][] intervals = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] solution = s.merge(intervals);
		assertTrue(Arrays.equals(solution, new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } }));
	}

	@Test
	public void testMergeIntervalsExample2() {
		int[][] intervals = new int[][] { { 1, 3 }, { 3, 4 } };
		int[][] solution = s.merge(intervals);
		assertTrue(Arrays.equals(solution, new int[][] { { 1, 4 } }));
	}
}
