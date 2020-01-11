package com.leetcode.problems.problem19;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leetcode.datastructures.ListNode;

/**
 * leriksen137
 */
public class SolutionTest {

	@Test
	public void testRemoveNthFromEnd() {
		Solution s = new Solution();
		ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
		int n = 2;
		s.removeNthFromEnd(head, n);
		assertTrue(head.toString().equals("1->2->3->5"));
	}
}
