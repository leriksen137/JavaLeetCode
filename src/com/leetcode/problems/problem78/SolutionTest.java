package com.leetcode.problems.problem78;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	public void testSubsetsExample() {
		int[] nums = new int[] { 1, 2, 3 };
		List<List<Integer>> actual = s.subsets(nums);
		List<List<Integer>> expected = createExpected();
		assertEquals(expected, actual);
	}

	private List<List<Integer>> createExpected() {
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(2)));
		expected.add(Arrays.asList(Integer.valueOf(1)));
		expected.add(Arrays.asList(Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1)));
		expected.add(Arrays.asList(Integer.valueOf(1), Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(2), Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2)));
		expected.add(new ArrayList<Integer>());
		return expected;
	}

}
