package com.leetcode.problems.problem19;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.ListNode;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 19, problemName = "Remove Nth Node From End of List")
public class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode headCopy = head;
		ListNode aheadByN = head;
		for (int i = 0; i < n; i++) {
			aheadByN = aheadByN.next;
		}
		if (aheadByN == null) {
			// catch special case that original head will be removed
			return headCopy.next;
		}
		while (aheadByN.next != null) {
			head = head.next;
			aheadByN = aheadByN.next;
		}

		head.next = head.next.next;

		return headCopy;
	}
}