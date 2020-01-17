package com.leetcode.problems.problem23;

import java.util.Comparator;
import java.util.PriorityQueue;

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
		// Total amount of nodes: O(N*L)
		// For each element in solution, go through priority queue and retrieve an element O(1)
		// and add one to the queue O(ln(N))
		// Total complexity: O(L*N*ln(N))
		ListNode dummy = new ListNode(0), cur = dummy;
		if (lists == null || lists.length < 1) {
			return null;
		}
		PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
			@Override
			public int compare(ListNode l1, ListNode l2) {
				return l1.val - l2.val;
			}
		});
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] != null) {
				minHeap.offer(lists[i]);
			}
		}
		while (!minHeap.isEmpty()) {
			ListNode temp = minHeap.poll();
			cur.next = temp;
			if (temp.next != null) {
				minHeap.offer(temp.next);
			}
			cur = temp;
		}
		return dummy.next;
	}
}