package com.leetcode.problems.problem19;

import static org.junit.Assert.assertEquals;

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
		assertEquals(head.toString(), "1->2->3->5");
	}
}
