package com.leetcode.problems.problem27;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * leriksen137
 */
public class SolutionTest {
	SolutionTemplate s;

	@Before
	public void initializeSolution() {
		s = new SolutionTemplate();
	}

	@Test
	public void testRemoveElementExample1() {
		int[] nums = new int[] { 3, 2, 2, 3 };
		int val = 3;
		int solutionLength = s.removeElement(nums, val);
		assertArrayEquals(Arrays.copyOfRange(nums, 0, solutionLength), new int[] { 2, 2 });
	}

	@Test
	public void testRemoveElementExample2() {
		int[] nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int solutionLength = s.removeElement(nums, val);
		assertArrayEquals(Arrays.copyOfRange(nums, 0, solutionLength), new int[] { 0, 1, 3, 0, 4 });
	}
}
