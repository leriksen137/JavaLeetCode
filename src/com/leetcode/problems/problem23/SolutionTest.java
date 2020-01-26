package com.leetcode.problems.problem23;

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
	public void testMergeSortedLists() {
		ListNode ln00 = new ListNode(1);
		ListNode ln01 = new ListNode(4);
		ListNode ln02 = new ListNode(5);
		ln00.next = ln01;
		ln01.next = ln02;

		ListNode ln10 = new ListNode(1);
		ListNode ln11 = new ListNode(3);
		ListNode ln12 = new ListNode(4);
		ln10.next = ln11;
		ln11.next = ln12;

		ListNode ln20 = new ListNode(2);
		ListNode ln21 = new ListNode(6);
		ln20.next = ln21;

		ListNode[] lists = new ListNode[] { ln00, ln10, ln20 };

		ListNode solution = s.mergeKLists(lists);
		assertEquals(solution.toString(), "1->1->2->3->4->4->5->6");
	}
}
