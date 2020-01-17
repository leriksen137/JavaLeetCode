package com.leetcode.problems.problem23;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.datastructures.ListNode;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 23, problemName = "Merge k Sorted Lists")
public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		// Array size N
		// Length of individual Listnode in Array L

		// Naïve solution: O(N^2*L)
		// Allocate new memory for each output node
		int numberOfNodes = numberOfNodesInAllLinkedLists(lists);
		ListNode solution = createEmptyLinkedListOfSize(numberOfNodes);
		ListNode nextToModify = solution;
		for (int i = 0; i < numberOfNodes; i++) {
			int smallest = getSmallestElementInLinkedLists(lists);
			removeValueFromLinkedLists(lists, smallest);

			nextToModify.val = smallest;
			nextToModify = nextToModify.next;
		}

		return solution;
	}

	private int numberOfNodesInAllLinkedLists(ListNode[] lists) {
		int result = 0;
		ListNode ptr;
		for (int i = 0; i < lists.length; i++) {
			ptr = lists[i];
			while (ptr != null) {
				result++;
				ptr = ptr.next;
			}
		}
		return result;
	}

	private ListNode createEmptyLinkedListOfSize(int numberOfElements) {
		if (numberOfElements == 0) {
			return null;
		}
		ListNode head = new ListNode(0);
		ListNode ptr = head;
		for (int i = 1; i < numberOfElements; i++) {
			ptr.next = new ListNode(0);
			ptr = ptr.next;
		}
		return head;
	}

	private int getSmallestElementInLinkedLists(ListNode[] lists) {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				if (lists[i].val < smallest) {
					smallest = lists[i].val;
				}
			}
		}
		return smallest;
	}

	private void removeValueFromLinkedLists(ListNode[] lists, int toRemove) {
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null && lists[i].val == toRemove) {
				lists[i] = lists[i].next;
				return;
			}
		}
	}
}