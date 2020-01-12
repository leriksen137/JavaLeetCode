package com.leetcode.problems.problem19;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.leetcode.framework.datastructures.ListNode;

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
	public void testRemoveNthFromEnd() {
		ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
		int n = 2;
		s.removeNthFromEnd(head, n);
		assertTrue(head.toString().equals("1->2->3->5"));
	}
}
