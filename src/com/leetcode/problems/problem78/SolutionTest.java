package com.leetcode.problems.problem78;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
	public void testSubsetsEdgeCase() {
		int[] nums = new int[] {};
		List<List<Integer>> actual = s.subsets(nums);
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Collections.emptyList());
		assertEquals(expected, actual);
	}

	@Test
	public void testSubsetsExample() {
		int[] nums = new int[] { 1, 2, 3 };
		List<List<Integer>> actual = s.subsets(nums);
		List<List<Integer>> expected = createExpected();
		assertContentOfListsEquals(expected, actual);
	}

	private List<List<Integer>> createExpected() {
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(Arrays.asList(Integer.valueOf(1)));
		expected.add(Arrays.asList(Integer.valueOf(2)));
		expected.add(Arrays.asList(Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1)));
		expected.add(Arrays.asList(Integer.valueOf(1), Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(2), Integer.valueOf(3)));
		expected.add(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2)));
		expected.add(new ArrayList<Integer>());
		return expected;
	}

	private void assertContentOfListsEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
		for (List<Integer> l : expected) {
			Collections.sort(l);
		}
		Collections.sort(expected, new ListComparator<>());
		for (List<Integer> l : actual) {
			Collections.sort(l);
		}
		Collections.sort(actual, new ListComparator<>());

		System.out.println(expected);
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

		@Override
		public int compare(List<T> o1, List<T> o2) {
			for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
				int c = o1.get(i).compareTo(o2.get(i));
				if (c != 0) {
					return c;
				}
			}
			return Integer.compare(o1.size(), o2.size());
		}

	}
}
