package com.leetcode.problems.problem18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {

	private List<List<Integer>> solutionSet;
	private Solution s;
	private int[] nums;
	private int target;

	@Before
	public void initialize() {
		s = new Solution();

		nums = new int[] { 1, 0, -1, 0, -2, 2 };
		target = 0;

		solutionSet = s.fourSum(nums, target);
	}

	@Test
	public void testFourSumSize() {
		assertEquals(solutionSet.size(), 3);
	}

	@Test
	public void testFourSumEqualsTarget() {
		for (List<Integer> list : solutionSet) {
			assertEquals(s.sum(list), target);
		}
	}

	@Test
	public void testFourSumNoDuplicates() {
		for (List<Integer> list1 : solutionSet) {
			for (List<Integer> list2 : solutionSet) {
				if (list1 != list2) {
					assertNotEquals(list1, list2);
				}
			}
		}
	}
}
